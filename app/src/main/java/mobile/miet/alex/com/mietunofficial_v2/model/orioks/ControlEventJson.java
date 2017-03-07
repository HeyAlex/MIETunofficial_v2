package mobile.miet.alex.com.mietunofficial_v2.model.orioks.json;

import com.google.gson.annotations.SerializedName;

/*package*/ class ControlEventJson {

    @SerializedName("ball")
    public MarkJson markJson;

    /**
     * There must be boolean, but they return "" - for false and 1 for true
     */
    @SerializedName("bonus")
    /*package*/ Object bonus;

    @SerializedName("max_ball")
    /*package*/ float maxPoints;

    @SerializedName("min_ball")
    /*package*/ float minPoints;

    @SerializedName("name")
    /*package*/ String subject;

    @SerializedName("type_name")
    /*package*/ String typeName;

    @SerializedName("week")
    /*package*/ int week;
}
