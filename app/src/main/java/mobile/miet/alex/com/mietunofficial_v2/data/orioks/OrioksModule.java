package mobile.miet.alex.com.mietunofficial_v2.data.orioks;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

import java.util.Collection;
import java.util.List;

import javax.inject.Singleton;

import dagger.Provides;
import mobile.miet.alex.com.mietunofficial_v2.data.BaseRepository;
import mobile.miet.alex.com.mietunofficial_v2.greenDao.DaoMaster;
import mobile.miet.alex.com.mietunofficial_v2.greenDao.DaoSession;
import mobile.miet.alex.com.mietunofficial_v2.greenDao.DisciplineModel;
import mobile.miet.alex.com.mietunofficial_v2.greenDao.UserModel;

public class OrioksModule{
    private static final String DATABASE_NAME = "orioks.db";
    private final DisciplineRepository disciplineRepository;
    private final EventRepository eventRepository;
    private final UserRepository userRepository;
    private final CredentialsRepository credentialsRepository;

    public OrioksModule(Context context) {
        DaoSession daoSession = createDaoSession(context);
        this.disciplineRepository = new AudiosRepositoryImpl(daoSession.getAudioDao());
        this.eventRepository = new AppUsersRepositoryImpl(context, daoSession.getAppUserDao());
        this.userRepository = new UserTokenRepositoryImpl(daoSession.getUserTokenDao());
        this.credentialsRepository = new VkUsersRepositoryImpl(daoSession.getVkUserDao());
    }

    private DaoSession createDaoSession(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DATABASE_NAME);
        Database db = helper.getWritableDb();
        return new DaoMaster(db).newSession();
    }

    @Provides
    @Singleton
    public DisciplineRepository provideDisciplinesRepository() {
        return audiosRepository;
    }

    @Provides
    @Singleton
    public EventRepository provideEventRepository() {
        return appUsersRepository;
    }

    @Provides
    @Singleton
    public UserRepository provideUserTokenRepository() {
        return userTokenRepository;
    }

    @Provides
    @Singleton
    public CredentialsRepository provideVkUsersRepository() {
        return vkUsersRepository;
    }

}
