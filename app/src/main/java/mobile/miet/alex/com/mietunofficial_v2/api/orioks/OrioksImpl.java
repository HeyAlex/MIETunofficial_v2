package mobile.miet.alex.com.mietunofficial_v2.api.orioks;


import java.util.concurrent.Callable;

import io.reactivex.Observable;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.credentials.UserCredentials;
import mobile.miet.alex.com.mietunofficial_v2.data.orioks.users.UserModel;
import mobile.miet.alex.com.mietunofficial_v2.model.orioks.OrioksJson;
import mobile.miet.alex.com.mietunofficial_v2.model.orioks.OrioksJsonDeserializer;
import mobile.miet.alex.com.mietunofficial_v2.model.orioks.OrioksResponse;
import retrofit2.Call;
import retrofit2.Response;
import timber.log.Timber;

/**
 * Concrete {@link Orioks} implementation
 */
public class OrioksImpl implements Orioks {
    private OrioksService orioksService = OrioksServiceGenerator.createOrioksService(OrioksService.class);

    @Override
    public Observable<OrioksResponse> getResponseForCurrentSemester(final UserCredentials credentials) {
        return Observable.fromCallable(new Callable<OrioksResponse>() {
            @Override
            public OrioksResponse call() throws Exception {
                Timber.i("Going to get orioks response for login: %s",
                        credentials.getLogin());
                Call<OrioksJson> call = orioksService
                        .getOrioksResponse(credentials.getLogin(), credentials.getPassword());
                Response<OrioksJson> response = call.execute();
                if (response.isSuccessful()) {
                    Timber.i("Retrofit response is successful");
                    OrioksJson orioksResponse = response.body();
                    Timber.i("orioksResponse.error = %s", orioksResponse.error);
                    if (orioksResponse.error instanceof Boolean) {
                        // everything's ok
                        return OrioksJsonDeserializer.convert(orioksResponse);
//                    } else if (orioksResponse.error instanceof String) {
//                       // throw new OrioksException("orioksResponse.error", (String) orioksResponse.error);
//                    } else {
//                       // throw new RuntimeException("orioksResponse.error is not String and is not Boolean");
                    }
                } else {
                    Timber.w("Retrofit response is not successful. Returning null");
                    return null;
                }
                return null;
            }
        });
    }
}
