package mobile.miet.alex.com.mietunofficial_v2.data.orioks;

import mobile.miet.alex.com.mietunofficial_v2.data.BaseRepository;
import mobile.miet.alex.com.mietunofficial_v2.greenDao.UserModel;

/**
 * Created by mac on 10.03.17.
 */

public interface UserRepository extends BaseRepository<UserRepository>{

    UserModel getStudent(UserCredentials userCredentials);

    void saveStudent(UserCredentials credentials, UserModel student);
}
