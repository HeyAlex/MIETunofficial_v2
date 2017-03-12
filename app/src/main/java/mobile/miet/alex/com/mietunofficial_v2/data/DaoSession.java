package mobile.miet.alex.com.mietunofficial_v2.data;



import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

import mobile.miet.alex.com.mietunofficial_v2.data.news.NewsModel;
import mobile.miet.alex.com.mietunofficial_v2.data.news.NewsModelDao;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineModelDao;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.events.EventModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.events.EventModelDao;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.resources.ResourceModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.resources.ResourceModelDao;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserModel;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserModelDao;
import mobile.miet.alex.com.mietunofficial_v2.data.schedule.LessonModel;
import mobile.miet.alex.com.mietunofficial_v2.data.schedule.LessonModelDao;
import mobile.miet.alex.com.mietunofficial_v2.data.schedule.ScheduleModel;
import mobile.miet.alex.com.mietunofficial_v2.data.schedule.ScheduleModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsModelDaoConfig;
    private final DaoConfig userModelDaoConfig;
    private final DaoConfig disciplineModelDaoConfig;
    private final DaoConfig eventModelDaoConfig;
    private final DaoConfig scheduleModelDaoConfig;
    private final DaoConfig lessonModelDaoConfig;
    private final DaoConfig resourceModelDaoConfig;

    private final NewsModelDao newsModelDao;
    private final UserModelDao userModelDao;
    private final DisciplineModelDao disciplineModelDao;
    private final EventModelDao eventModelDao;
    private final ScheduleModelDao scheduleModelDao;
    private final LessonModelDao lessonModelDao;
    private final ResourceModelDao resourceModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsModelDaoConfig = daoConfigMap.get(NewsModelDao.class).clone();
        newsModelDaoConfig.initIdentityScope(type);

        userModelDaoConfig = daoConfigMap.get(UserModelDao.class).clone();
        userModelDaoConfig.initIdentityScope(type);

        disciplineModelDaoConfig = daoConfigMap.get(DisciplineModelDao.class).clone();
        disciplineModelDaoConfig.initIdentityScope(type);

        eventModelDaoConfig = daoConfigMap.get(EventModelDao.class).clone();
        eventModelDaoConfig.initIdentityScope(type);

        scheduleModelDaoConfig = daoConfigMap.get(ScheduleModelDao.class).clone();
        scheduleModelDaoConfig.initIdentityScope(type);

        lessonModelDaoConfig = daoConfigMap.get(LessonModelDao.class).clone();
        lessonModelDaoConfig.initIdentityScope(type);

        resourceModelDaoConfig = daoConfigMap.get(ResourceModelDao.class).clone();
        resourceModelDaoConfig.initIdentityScope(type);

        newsModelDao = new NewsModelDao(newsModelDaoConfig, this);
        userModelDao = new UserModelDao(userModelDaoConfig, this);
        disciplineModelDao = new DisciplineModelDao(disciplineModelDaoConfig, this);
        eventModelDao = new EventModelDao(eventModelDaoConfig, this);
        scheduleModelDao = new ScheduleModelDao(scheduleModelDaoConfig, this);
        lessonModelDao = new LessonModelDao(lessonModelDaoConfig, this);
        resourceModelDao = new ResourceModelDao(resourceModelDaoConfig, this);

        registerDao(NewsModel.class, newsModelDao);
        registerDao(UserModel.class, userModelDao);
        registerDao(DisciplineModel.class, disciplineModelDao);
        registerDao(EventModel.class, eventModelDao);
        registerDao(ScheduleModel.class, scheduleModelDao);
        registerDao(LessonModel.class, lessonModelDao);
        registerDao(ResourceModel.class, resourceModelDao);
    }
    
    public void clear() {
        newsModelDaoConfig.clearIdentityScope();
        userModelDaoConfig.clearIdentityScope();
        disciplineModelDaoConfig.clearIdentityScope();
        eventModelDaoConfig.clearIdentityScope();
        scheduleModelDaoConfig.clearIdentityScope();
        lessonModelDaoConfig.clearIdentityScope();
        resourceModelDaoConfig.clearIdentityScope();
    }

    public NewsModelDao getNewsModelDao() {
        return newsModelDao;
    }

    public UserModelDao getUserModelDao() {
        return userModelDao;
    }

    public DisciplineModelDao getDisciplineModelDao() {
        return disciplineModelDao;
    }

    public EventModelDao getEventModelDao() {
        return eventModelDao;
    }

    public ScheduleModelDao getScheduleModelDao() {
        return scheduleModelDao;
    }

    public LessonModelDao getLessonModelDao() {
        return lessonModelDao;
    }

    public ResourceModelDao getResourceModelDao() {
        return resourceModelDao;
    }

}