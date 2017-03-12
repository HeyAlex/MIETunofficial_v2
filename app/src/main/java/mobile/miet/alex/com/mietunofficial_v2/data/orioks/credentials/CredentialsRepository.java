package mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials;

/**
 * Created by mac on 10.03.17.
 */

public interface CredentialsRepository {

    void setAsActive(UserCredentials credentials);

    UserCredentials getActive();

    boolean hasActiveUser();

    void saveAndSetAsActive(UserCredentials credentials);

    void removeActiveCredentials();
}
