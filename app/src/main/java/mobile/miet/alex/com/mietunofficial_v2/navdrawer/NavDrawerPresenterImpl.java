package mobile.miet.alex.com.mietunofficial_v2.navdrawer;

import javax.inject.Inject;

import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.CredentialsRepository;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserRepository;

/**
 * Created by mac on 11.03.17.
 */

public class NavDrawerPresenterImpl implements NavDrawerPresenter {

    private UserRepository repository;
    private CredentialsRepository credentialsRepository;

    @Inject
    public NavDrawerPresenterImpl(UserRepository repository, CredentialsRepository credentialsRepository) {
        this.repository = repository;
        this.credentialsRepository = credentialsRepository;
    }

    @Override
    public void onViewAttached(NavDrawerView view) {

    }

    @Override
    public void onViewDetached() {

    }
}
