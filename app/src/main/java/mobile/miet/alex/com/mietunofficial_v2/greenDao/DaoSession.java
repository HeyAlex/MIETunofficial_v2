package mobile.miet.alex.com.mietunofficial_v2.greenDao;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsModelDaoConfig;
    private final DaoConfig disciplineModelDaoConfig;
    private final DaoConfig eventModelDaoConfig;
    private final DaoConfig userModelDaoConfig;
    private final DaoConfig scheduleModelDaoConfig;
    private final DaoConfig lessonModelDaoConfig;
    private final DaoConfig resourceModelDaoConfig;

    private final NewsModelDao newsModelDao;
    private final DisciplineModelDao disciplineModelDao;
    private final EventModelDao eventModelDao;
    private final UserModelDao userModelDao;
    private final ScheduleModelDao scheduleModelDao;
    private final LessonModelDao lessonModelDao;
    private final ResourceModelDao resourceModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsModelDaoConfig = daoConfigMap.get(NewsModelDao.class).clone();
        newsModelDaoConfig.initIdentityScope(type);

        disciplineModelDaoConfig = daoConfigMap.get(DisciplineModelDao.class).clone();
        disciplineModelDaoConfig.initIdentityScope(type);

        eventModelDaoConfig = daoConfigMap.get(EventModelDao.class).clone();
        eventModelDaoConfig.initIdentityScope(type);

        userModelDaoConfig = daoConfigMap.get(UserModelDao.class).clone();
        userModelDaoConfig.initIdentityScope(type);

        scheduleModelDaoConfig = daoConfigMap.get(ScheduleModelDao.class).clone();
        scheduleModelDaoConfig.initIdentityScope(type);

        lessonModelDaoConfig = daoConfigMap.get(LessonModelDao.class).clone();
        lessonModelDaoConfig.initIdentityScope(type);

        resourceModelDaoConfig = daoConfigMap.get(ResourceModelDao.class).clone();
        resourceModelDaoConfig.initIdentityScope(type);

        newsModelDao = new NewsModelDao(newsModelDaoConfig, this);
        disciplineModelDao = new DisciplineModelDao(disciplineModelDaoConfig, this);
        eventModelDao = new EventModelDao(eventModelDaoConfig, this);
        userModelDao = new UserModelDao(userModelDaoConfig, this);
        scheduleModelDao = new ScheduleModelDao(scheduleModelDaoConfig, this);
        lessonModelDao = new LessonModelDao(lessonModelDaoConfig, this);
        resourceModelDao = new ResourceModelDao(resourceModelDaoConfig, this);

        registerDao(NewsModel.class, newsModelDao);
        registerDao(DisciplineModel.class, disciplineModelDao);
        registerDao(EventModel.class, eventModelDao);
        registerDao(UserModel.class, userModelDao);
        registerDao(ScheduleModel.class, scheduleModelDao);
        registerDao(LessonModel.class, lessonModelDao);
        registerDao(ResourceModel.class, resourceModelDao);
    }
    
    public void clear() {
        newsModelDaoConfig.clearIdentityScope();
        disciplineModelDaoConfig.clearIdentityScope();
        eventModelDaoConfig.clearIdentityScope();
        userModelDaoConfig.clearIdentityScope();
        scheduleModelDaoConfig.clearIdentityScope();
        lessonModelDaoConfig.clearIdentityScope();
        resourceModelDaoConfig.clearIdentityScope();
    }

    public NewsModelDao getNewsModelDao() {
        return newsModelDao;
    }

    public DisciplineModelDao getDisciplineModelDao() {
        return disciplineModelDao;
    }

    public EventModelDao getEventModelDao() {
        return eventModelDao;
    }

    public UserModelDao getUserModelDao() {
        return userModelDao;
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