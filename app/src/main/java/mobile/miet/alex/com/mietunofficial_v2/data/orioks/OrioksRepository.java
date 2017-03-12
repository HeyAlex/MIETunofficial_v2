package mobile.miet.alex.com.mietunofficial_v2.data.orioks;

import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.UserCredentials;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserModel;

/**
 * Created by mac on 12.03.17.
 */

public interface OrioksRepository {

    UserModel getCurrentUser(UserCredentials userCredentials);

}
