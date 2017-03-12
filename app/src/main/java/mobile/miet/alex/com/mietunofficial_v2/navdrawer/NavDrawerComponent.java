package mobile.miet.alex.com.mietunofficial_v2.navdrawer;

import dagger.Component;
import mobile.miet.alex.com.mietunofficial_v2.ApplicationComponent;
import mobile.miet.alex.com.mietunofficial_v2.mvp.BaseActivity;


@NavDrawerScope
@Component(dependencies = ApplicationComponent.class)
public interface NavDrawerComponent {

    void inject(BaseActivity activity);
}
