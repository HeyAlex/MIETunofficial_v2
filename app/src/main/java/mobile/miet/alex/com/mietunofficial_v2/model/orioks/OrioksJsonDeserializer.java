package mobile.miet.alex.com.mietunofficial_v2.model.orioks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.events.EventModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserModel;

/**
 * Created by mac on 11.03.17.
 */

public class OrioksJsonDeserializer {
    public static OrioksResponse convert(OrioksJson orioksResponseJson) {

        UserModel student = new UserModel(orioksResponseJson.numst, orioksResponseJson.currentWeek,
                orioksResponseJson.firstName, orioksResponseJson.lastName, orioksResponseJson.patronymic,
                orioksResponseJson.studyProgram, orioksResponseJson.currentSemester);

        List<DisciplineModel> disciplines = new ArrayList<>();
        List<EventModel> events = new ArrayList<>();

        for(DisciplineJson disciplineJson : orioksResponseJson.disciplines.values()) {
            disciplines.add(convertDiscipline(disciplineJson , orioksResponseJson.numst));
            for (ControlEventJson controlEventJson : disciplineJson.controlEvents) {
                events.add(convertControlEventJson(controlEventJson,
                        disciplineJson.disciplineId, disciplineJson.linkId));
            }
        }
        return new OrioksResponse(student,disciplines,events);
    }

    private static DisciplineModel convertDiscipline(DisciplineJson disciplineJson , int numst) {
        Iterator<TeacherJson> iter = disciplineJson.teacherMap.values().iterator();
        StringBuilder teachers = new StringBuilder();
        if (iter.hasNext()) {
            teachers.append(iter.next());
            while (iter.hasNext()) {
                if(teachers.length() > 0){
                    teachers.append(iter.next().name + "\n");
                }else {
                    teachers.append(iter.next().name);
                }
            }
        }
        return new DisciplineModel(disciplineJson.linkId, disciplineJson.assessmentType,
                disciplineJson.name,
                (disciplineJson.grades.ballPoints instanceof Number
                        ? (float)((double)(disciplineJson.grades.ballPoints)) : -1.0f),
                disciplineJson.maxPoints, disciplineJson.minPoints,
                disciplineJson.grades.markPoints, disciplineJson.disciplineId ,
                teachers.toString(), numst);
    }

    private static EventModel convertControlEventJson(ControlEventJson controlEventJson ,
                                                      int disciplineId, int linkId) {
        return new EventModel(disciplineId, controlEventJson.subject, controlEventJson.typeName,
                (controlEventJson.markJson.ballPoints instanceof Number
                        ? (float)((double)(controlEventJson.markJson.ballPoints)) : -1.0f),
                controlEventJson.maxPoints, controlEventJson.minPoints,
                controlEventJson.markJson.markPoints, controlEventJson.sh,
                controlEventJson.week, controlEventJson.markJson.enteredBy, linkId);
    }
}
