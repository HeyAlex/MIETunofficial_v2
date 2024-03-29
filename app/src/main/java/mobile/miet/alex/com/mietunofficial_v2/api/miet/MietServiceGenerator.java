package mobile.miet.alex.com.mietunofficial_v2.api.miet;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class MietServiceGenerator {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public final static String SERVICE_MIET_ENDPOINT = "https://miet.ru";
    public final static String SCHEDULE_POINT = "/schedule/";
    public static String NEWS_POINT = "/rss/news/";

    private static Retrofit.Builder retrofitScheduleBuilder
            = new Retrofit.Builder()
            .baseUrl(SERVICE_MIET_ENDPOINT + SCHEDULE_POINT)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit.Builder retrofitNewsBuilder
            = new Retrofit.Builder()
            .baseUrl(SERVICE_MIET_ENDPOINT + NEWS_POINT)
            .addConverterFactory(SimpleXmlConverterFactory.create());

    public static <S> S createScheduleService(Class<S> serviceClass){
        Retrofit retrofit = retrofitScheduleBuilder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }

    public static <S> S createNewsService(Class<S> serviceClass){
        Retrofit retrofit = retrofitNewsBuilder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }

}
