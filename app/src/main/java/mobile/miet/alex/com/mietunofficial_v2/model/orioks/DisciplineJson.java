package mobile.miet.alex.com.mietunofficial_v2.model.orioks.json;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * JsonSchema2PoJo
 */
/*package*/ class DisciplineJson {

    @SerializedName("itog_name")
    /*package*/ String assessmentType;

    @SerializedName("kms")
    /*package*/ ControlEventJson[] controlEvents;

    @SerializedName("name")
    /*package*/ String name;

    @SerializedName("preps")
    /*package*/ Map<Integer, TeacherJson> teacherMap;

    /**
     * This value is a key for {@link OrioksResponseJson#departments} department
     * associated with this discipline
     */
    @SerializedName("id_dis")
    int disciplineId;
}
