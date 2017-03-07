package mobile.miet.alex.com.mietunofficial_v2.model.orioks.json;


import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * JsonSchema2PoJo
 */
/*package*/ class OrioksResponseJson {

    @SerializedName("dis")
    /*package*/ Map<Integer, DisciplineJson> disciplines;

    /**
     * There is boolean false if no error occurred and String if any error occurred
     */
    @SerializedName("error")
    /*package*/ Object error;

    @SerializedName("napr")
    /*package*/ String studyProgram;

    @SerializedName("st_fam")
    /*package*/ String lastName;

    @SerializedName("st_gr")
    /*package*/ GroupJson group;

    @SerializedName("st_name")
    /*package*/ String firstName;

    @SerializedName("st_otch")
    /*package*/ String patronymic;

    @SerializedName("sem")
    /*package*/ int currentSemester;

    @SerializedName("week")
    /*package*/ int currentWeek;

    @SerializedName("kafs")
    /*package*/ Map<Integer, DepartmentJson> departments;
}
