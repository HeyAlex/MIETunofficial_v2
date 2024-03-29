package mobile.miet.alex.com.mietunofficial_v2.data.orioks.events;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "EVENT_MODEL".
 */
@Entity
public class EventModel implements java.io.Serializable {

    @Id
    private Integer idDis;
    private String itogName;
    private String name;
    private Float ballPoints;
    private Float minBall;
    private Float maxBall;
    private Integer markPoints;
    private String sh;
    private Integer week;
    private String enteredBy;
    private int idLink;

    @Generated
    public EventModel() {
    }

    public EventModel(Integer idDis) {
        this.idDis = idDis;
    }

    @Generated
    public EventModel(Integer idDis, String itogName, String name, Float ballPoints, Float minBall, Float maxBall, Integer markPoints, String sh, Integer week, String enteredBy, int idLink) {
        this.idDis = idDis;
        this.itogName = itogName;
        this.name = name;
        this.ballPoints = ballPoints;
        this.minBall = minBall;
        this.maxBall = maxBall;
        this.markPoints = markPoints;
        this.sh = sh;
        this.week = week;
        this.enteredBy = enteredBy;
        this.idLink = idLink;
    }

    public Integer getIdDis() {
        return idDis;
    }

    public void setIdDis(Integer idDis) {
        this.idDis = idDis;
    }

    public String getItogName() {
        return itogName;
    }

    public void setItogName(String itogName) {
        this.itogName = itogName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBallPoints() {
        return ballPoints;
    }

    public void setBallPoints(Float ballPoints) {
        this.ballPoints = ballPoints;
    }

    public Float getMinBall() {
        return minBall;
    }

    public void setMinBall(Float minBall) {
        this.minBall = minBall;
    }

    public Float getMaxBall() {
        return maxBall;
    }

    public void setMaxBall(Float maxBall) {
        this.maxBall = maxBall;
    }

    public Integer getMarkPoints() {
        return markPoints;
    }

    public void setMarkPoints(Integer markPoints) {
        this.markPoints = markPoints;
    }

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getEnteredBy() {
        return enteredBy;
    }

    public void setEnteredBy(String enteredBy) {
        this.enteredBy = enteredBy;
    }

    public int getIdLink() {
        return idLink;
    }

    public void setIdLink(int idLink) {
        this.idLink = idLink;
    }

}
