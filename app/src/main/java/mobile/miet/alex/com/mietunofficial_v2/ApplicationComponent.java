package mobile.miet.alex.com.mietunofficial_v2;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import mobile.miet.alex.com.mietunofficial_v2.api.orioks.Orioks;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.OrioksModule;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.CredentialsRepository;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines.DisciplineRepositoryImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.events.EventRepositoryImpl;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserRepository;
import mobile.miet.alex.com.mietunofficial_v2.navdrawer.NavDrawerModule;
import mobile.miet.alex.com.mietunofficial_v2.navdrawer.NavDrawerPresenter;

@Singleton
@Component(modules = {
        OrioksModule.class,
        CredentialsRepository.class,
        ApplicationModule.class,
        NavDrawerModule.class})

public interface ApplicationComponent {

    NavDrawerPresenter getNavPresenter();

    UserRepository getUserRepository();

    DisciplineRepositoryImpl getDisciplineRepository();

    EventRepositoryImpl getEventRepository();

    Orioks getOrioks();

    CredentialsRepository getCredentialsRepository();

    Context getContext();
}