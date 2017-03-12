package mobile.miet.alex.com.mietunofficial_v2.model.orioks;

import java.util.List;

import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.events.EventModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserModel;

/**
 * Created by mac on 11.03.17.
 */

public class OrioksResponse {
    public UserModel user;
    public List<DisciplineModel> disciplines;
    public List<EventModel> events;

    public OrioksResponse(UserModel student, List<DisciplineModel> disciplines, List<EventModel> events) {

    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public List<DisciplineModel> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<DisciplineModel> disciplines) {
        this.disciplines = disciplines;
    }

    public List<EventModel> getEvents() {
        return events;
    }

    public void setEvents(List<EventModel> events) {
        this.events = events;
    }
}
