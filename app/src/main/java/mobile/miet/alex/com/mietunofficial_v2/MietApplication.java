package mobile.miet.alex.com.mietunofficial_v2;

import android.app.Application;

import timber.log.Timber;

public class MietApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        initTimber();

    }

    private void initTimber() {
        Timber.plant(new Timber.DebugTree());
    }

}
