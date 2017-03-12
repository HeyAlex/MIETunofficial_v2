package mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials;

import android.content.Context;

/**
 * Created by mac on 10.03.17.
 */

public class CredentialsRepositoryImpl implements CredentialsRepository{

    public CredentialsRepositoryImpl(Context context) {

    }

    @Override
    public void setAsActive(UserCredentials credentials) {

    }

    @Override
    public UserCredentials getActive() {
        return null;
    }

    @Override
    public boolean hasActiveUser() {
        return false;
    }

    @Override
    public void saveAndSetAsActive(UserCredentials credentials) {

    }

    @Override
    public void removeActiveCredentials() {

    }
}
