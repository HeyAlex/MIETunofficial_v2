package mobile.miet.alex.com.mietunofficial_v2.greenDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "SCHEDULE_MODEL".
 */
@Entity(active = true)
public class ScheduleModel implements java.io.Serializable {

    @Id
    private String group;
    private String semestr;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient ScheduleModelDao myDao;

    @ToMany(joinProperties = {
        @JoinProperty(name = "group", referencedName = "week1")
    })
    private List<LessonModel> LessonsOne;

    @ToMany(joinProperties = {
        @JoinProperty(name = "group", referencedName = "week2")
    })
    private List<LessonModel> LessonsTwo;

    @ToMany(joinProperties = {
        @JoinProperty(name = "group", referencedName = "week3")
    })
    private List<LessonModel> LessonsThird;

    @ToMany(joinProperties = {
        @JoinProperty(name = "group", referencedName = "week4")
    })
    private List<LessonModel> LessonsFour;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public ScheduleModel() {
    }

    public ScheduleModel(String group) {
        this.group = group;
    }

    @Generated
    public ScheduleModel(String group, String semestr) {
        this.group = group;
        this.semestr = semestr;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getScheduleModelDao() : null;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSemestr() {
        return semestr;
    }

    public void setSemestr(String semestr) {
        this.semestr = semestr;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<LessonModel> getLessonsOne() {
        if (LessonsOne == null) {
            __throwIfDetached();
            LessonModelDao targetDao = daoSession.getLessonModelDao();
            List<LessonModel> LessonsOneNew = targetDao._queryScheduleModel_LessonsOne(group);
            synchronized (this) {
                if(LessonsOne == null) {
                    LessonsOne = LessonsOneNew;
                }
            }
        }
        return LessonsOne;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetLessonsOne() {
        LessonsOne = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<LessonModel> getLessonsTwo() {
        if (LessonsTwo == null) {
            __throwIfDetached();
            LessonModelDao targetDao = daoSession.getLessonModelDao();
            List<LessonModel> LessonsTwoNew = targetDao._queryScheduleModel_LessonsTwo(group);
            synchronized (this) {
                if(LessonsTwo == null) {
                    LessonsTwo = LessonsTwoNew;
                }
            }
        }
        return LessonsTwo;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetLessonsTwo() {
        LessonsTwo = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<LessonModel> getLessonsThird() {
        if (LessonsThird == null) {
            __throwIfDetached();
            LessonModelDao targetDao = daoSession.getLessonModelDao();
            List<LessonModel> LessonsThirdNew = targetDao._queryScheduleModel_LessonsThird(group);
            synchronized (this) {
                if(LessonsThird == null) {
                    LessonsThird = LessonsThirdNew;
                }
            }
        }
        return LessonsThird;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetLessonsThird() {
        LessonsThird = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<LessonModel> getLessonsFour() {
        if (LessonsFour == null) {
            __throwIfDetached();
            LessonModelDao targetDao = daoSession.getLessonModelDao();
            List<LessonModel> LessonsFourNew = targetDao._queryScheduleModel_LessonsFour(group);
            synchronized (this) {
                if(LessonsFour == null) {
                    LessonsFour = LessonsFourNew;
                }
            }
        }
        return LessonsFour;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetLessonsFour() {
        LessonsFour = null;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
