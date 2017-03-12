package mobile.miet.alex.com.mietunofficial_v2.data.orioks.users;


import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

import mobile.miet.alex.com.mietunofficial_v2.data.DaoSession;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "USER_MODEL".
 */
@Entity(active = true)
public class UserModel implements java.io.Serializable {

    @Id
    private int numst;
    private Integer week;
    private String firstName;
    private String lastName;
    private String lastlastName;
    private String napr;
    private Integer sem;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient UserModelDao myDao;

    @ToMany(joinProperties = {
        @JoinProperty(name = "numst", referencedName = "numst")
    })
    private List<DisciplineModel> disciplines;

    @Generated
    public UserModel() {
    }

    public UserModel(int numst) {
        this.numst = numst;
    }

    @Generated
    public UserModel(int numst, Integer week, String firstName, String lastName, String lastlastName, String napr, Integer sem) {
        this.numst = numst;
        this.week = week;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastlastName = lastlastName;
        this.napr = napr;
        this.sem = sem;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserModelDao() : null;
    }

    public int getNumst() {
        return numst;
    }

    public void setNumst(int numst) {
        this.numst = numst;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastlastName() {
        return lastlastName;
    }

    public void setLastlastName(String lastlastName) {
        this.lastlastName = lastlastName;
    }

    public String getNapr() {
        return napr;
    }

    public void setNapr(String napr) {
        this.napr = napr;
    }

    public Integer getSem() {
        return sem;
    }

    public void setSem(Integer sem) {
        this.sem = sem;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<DisciplineModel> getDisciplines() {
        if (disciplines == null) {
            __throwIfDetached();
            DisciplineModelDao targetDao = daoSession.getDisciplineModelDao();
            List<DisciplineModel> disciplinesNew = targetDao._queryUserModel_Disciplines(numst);
            synchronized (this) {
                if(disciplines == null) {
                    disciplines = disciplinesNew;
                }
            }
        }
        return disciplines;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetDisciplines() {
        disciplines = null;
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

}