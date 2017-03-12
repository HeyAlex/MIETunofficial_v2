package mobile.miet.alex.com.mietunofficial_v2.model.orioks;


import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * JsonSchema2PoJo
 * It's internal class which maps raw response to pojo
 * It should not go out of this package.
 */
public class OrioksJson {

    @SerializedName("dis")
    public Map<Integer, DisciplineJson> disciplines;

    @SerializedName("error")
    public Object error;

    @SerializedName("napr")
    public String studyProgram;

    @SerializedName("st_fam")
    public String lastName;

    @SerializedName("st_name")
    public String firstName;

    @SerializedName("st_otch")
    public String patronymic;

    @SerializedName("sem")
    public int currentSemester;

    @SerializedName("numst")
    public int numst;

    @SerializedName("week")
    public int currentWeek;
}
