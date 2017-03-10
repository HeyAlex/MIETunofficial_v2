package mobile.miet.alex.com.mietunofficial_v2.data.orioks;

import mobile.miet.alex.com.mietunofficial_v2.util.Preconditions;

/**
 * Created by mac on 10.03.17.
 */

public class UserCredentials {
    private final String login;
    private final String password;


    public UserCredentials(String login, String password) {
        this.login = Preconditions.checkNotNull(login);
        this.password = Preconditions.checkNotNull(password);
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

}
