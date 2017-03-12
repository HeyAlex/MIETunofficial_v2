package mobile.miet.alex.com.mietunofficial_v2.data.orioks.users;

import java.util.List;

import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.UserCredentials;

/**
 * Created by mac on 10.03.17.
 */

public class UserRepositoryImpl implements UserRepository {

    public UserRepositoryImpl(UserModelDao userModelDao) {

    }

    @Override
    public UserModel getStudent(UserCredentials userCredentials) {
        return null;
    }

    @Override
    public void saveStudent(UserCredentials credentials, UserModel student) {

    }

    @Override
    public void save(UserRepository entity) {

    }

    @Override
    public void saveAll(Iterable<UserRepository> entities) {

    }

    @Override
    public List<UserRepository> getAll() {
        return null;
    }

    @Override
    public void update(UserRepository entity) {

    }

    @Override
    public void updateAll(Iterable<UserRepository> entities) {

    }

    @Override
    public void delete(UserRepository entity) {

    }

    @Override
    public void deleteAll() {

    }
}
