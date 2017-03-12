package mobile.miet.alex.com.mietunofficial_v2;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import mobile.miet.alex.com.mietunofficial_v2.data.orioks.OrioksModule;
import mobile.miet.alex.com.mietunofficial_v2.navdrawer.NavDrawerComponent;
import timber.log.Timber;

public class MietApplication extends Application{

    @NonNull // initialized in onCreate()
    private ApplicationComponent applicationComponent;

    private DisciplineDetailsComponent disciplineDetailsComponent;
    private NavDrawerComponent navDrawerComponent;
    private DisciplineComponent disciplineComponent;
    private LoginComponent loginComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initTimber();

    }

    private void initTimber() {
        Timber.plant(new Timber.DebugTree());
    }

    public static MietApplication get(Context context) {
        if (context == null) {
            throw new NullPointerException("context == null");
        }
        return (MietApplication) context.getApplicationContext();
    }

    protected DaggerApplicationComponent.Builder prepareApplicationComponent(){
        return DaggerApplicationComponent.builder();
    }

    @NonNull
    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }

    private void initDaggerComponents(){

        this.disciplineDetailsComponent = initDisciplineDetailsComponent();

        this.navDrawerComponent = initNavDrawerComponent();
        this.disciplineComponent = initDisciplineComponent();
        this.loginComponent = initLoginComponent();
    }

    private DisciplineDetailsComponent initDisciplineDetailsComponent(){
        return DaggerDisciplineDetailsComponent.builder()
                .applicationComponent(applicationComponent)
                .build();
    }


    private NavDrawerComponent initNavDrawerComponent(){
        return DaggerNavDrawerComponent
                .builder()
                .applicationComponent(applicationComponent)
                .build();
    }

    private DisciplineComponent initDisciplineComponent(){
        return DaggerDisciplineComponent
                .builder()
                .applicationComponent(applicationComponent)
                .learningModule(new DisciplineModule())
                .build();
    }

    private LoginComponent initLoginComponent(){
        return DaggerLoginComponent
                .builder()
                .applicationComponent(applicationComponent)
                .build();
    }

    public DisciplineDetailsComponent getDisciplineDetailsComponent() {
        return disciplineDetailsComponent;
    }

    public NavDrawerComponent getHeaderComponent() {
        return headerComponent;
    }

    public DisciplineComponent getLearningComponent() {
        return learningComponent;
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }


}
