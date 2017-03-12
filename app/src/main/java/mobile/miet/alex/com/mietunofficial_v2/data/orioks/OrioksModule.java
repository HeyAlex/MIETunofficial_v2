package mobile.miet.alex.com.mietunofficial_v2.data.orioks;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

import javax.inject.Singleton;

import dagger.Provides;
import mobile.miet.alex.com.mietunofficial_v2.api.orioks.Orioks;
import mobile.miet.alex.com.mietunofficial_v2.api.orioks.OrioksImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.CredentialsRepository;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.CredentialsRepositoryImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineRepositoryImpl;

import mobile.miet.alex.com.mietunofficial_v2.data.orioks.events.EventRepositoryImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserRepository;
import mobile.miet.alex.com.mietunofficial_v2.data.DaoMaster;
import mobile.miet.alex.com.mietunofficial_v2.data.DaoSession;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserRepositoryImpl;

public class OrioksModule{
    private static final String DATABASE_NAME = "orioks.db";
    private final DisciplineRepositoryImpl disciplineRepository;
    private final EventRepositoryImpl eventRepository;
    private final UserRepository userRepository;
    private final CredentialsRepository credentialsRepository;

    public OrioksModule(Context context) {
        DaoSession daoSession = createDaoSession(context);
        this.disciplineRepository = new DisciplineRepositoryImpl(daoSession.getDisciplineModelDao());
        this.eventRepository = new EventRepositoryImpl(daoSession.getEventModelDao());
        this.userRepository = new UserRepositoryImpl(daoSession.getUserModelDao());
        this.credentialsRepository = new CredentialsRepositoryImpl(context);
    }

    private DaoSession createDaoSession(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DATABASE_NAME);
        Database db = helper.getWritableDb();
        return new DaoMaster(db).newSession();
    }

    @Provides
    @Singleton
    public DisciplineRepositoryImpl provideDisciplinesRepository() {
        return disciplineRepository;
    }

    @Provides
    @Singleton
    public EventRepositoryImpl provideEventRepository() {
        return eventRepository;
    }

    @Provides
    @Singleton
    public UserRepository provideUserRepository() {
        return userRepository;
    }

    @Provides
    @Singleton
    public CredentialsRepository provideCredentialsRepository() {
        return credentialsRepository;
    }

    @Provides
    @Singleton
    public Orioks provideOrioks() {
        return new OrioksImpl();
    }
}
