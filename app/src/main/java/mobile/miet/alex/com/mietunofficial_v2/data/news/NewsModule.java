package mobile.miet.alex.com.mietunofficial_v2.data.news;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

import javax.inject.Singleton;

import dagger.Provides;
import mobile.miet.alex.com.mietunofficial_v2.data.DaoMaster;
import mobile.miet.alex.com.mietunofficial_v2.data.DaoSession;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.CredentialsRepositoryImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineRepositoryImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.events.EventRepositoryImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserRepositoryImpl;

/**
 * Created by mac on 10.03.17.
 */

public class NewsModule {
    private static final String DATABASE_NAME = "news.db";
    private final NewsRepositoryImpl newsRepository;

    public NewsModule(Context context) {
        DaoSession daoSession = createDaoSession(context);
        this.newsRepository = new NewsRepositoryImpl(daoSession.getNewsModelDao());
    }

    private DaoSession createDaoSession(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DATABASE_NAME);
        Database db = helper.getWritableDb();
        return new DaoMaster(db).newSession();
    }

    @Provides
    @Singleton
    public NewsRepositoryImpl provideNewsRepository() {
        return newsRepository;
    }

}
