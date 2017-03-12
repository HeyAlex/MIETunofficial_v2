package mobile.miet.alex.com.mietunofficial_v2.navdrawer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.CredentialsRepository;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserRepository;

/**
 * Created by mac on 11.03.17.
 */

@Module
public class NavDrawerModule {

    @Singleton
    @Provides
    public NavDrawerPresenter provideHeaderPresenter(UserRepository repository, CredentialsRepository credentialsManager){
        return new NavDrawerPresenterImpl(repository, credentialsManager) {
        };
    }
}

