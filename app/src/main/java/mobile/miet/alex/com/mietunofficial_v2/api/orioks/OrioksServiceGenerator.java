package mobile.miet.alex.com.mietunofficial_v2.api.orioks;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by mac on 01.03.17.
 */

public class OrioksServiceGenerator {
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public final static String SERVICE_ORIOKS_ENDPOINT = "https://orioks.miet.ru";

    private static Retrofit.Builder retrofitScheduleBuilder
            = new Retrofit.Builder()
            .baseUrl(SERVICE_ORIOKS_ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createOrioksService(Class<S> serviceClass){
        Retrofit retrofit = retrofitScheduleBuilder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }

}
