package mobile.miet.alex.com.mietunofficial_v2.data.orioks;

import mobile.miet.alex.com.mietunofficial_v2.greenDao.UserModel;

/**
 * Created by mac on 10.03.17.
 */

public interface CredentialsRepository {

    void setAsActive(UserCredentials credentials);

    UserCredentials getActive();

    boolean hasActiveAppUser();

    void saveAndSetAsActive(UserCredentials credentials);

    void removeActiveCredentials();
}
