package mobile.miet.alex.com.mietunofficial_v2.api.orioks;

import io.reactivex.Observable;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.UserCredentials;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserModel;
import mobile.miet.alex.com.mietunofficial_v2.model.orioks.OrioksResponse;

public interface Orioks {

    Observable<OrioksResponse> getResponseForCurrentSemester(UserCredentials credentials);

}
