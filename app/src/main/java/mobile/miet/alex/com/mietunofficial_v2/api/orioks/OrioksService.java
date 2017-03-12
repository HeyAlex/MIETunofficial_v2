package mobile.miet.alex.com.mietunofficial_v2.api.orioks;

import mobile.miet.alex.com.mietunofficial_v2.model.orioks.OrioksJson;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mac on 27.02.17.
 */

public interface OrioksService {

    @GET("ORIOKSLive/?AUTH_FORM=Y&TYPE=AUTH&backurl=index.php")
    Call<OrioksJson> getOrioksResponse(@Query("USER_LOGIN") String login, @Query("USER_PASSWORD") String password);

}
