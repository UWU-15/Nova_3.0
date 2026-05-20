package com.example.nova.data.remote;

import com.example.nova.config.Constants;
import com.example.nova.data.remote.api.TrackApiService;
import com.example.nova.data.remote.api.PlaylistApiService;
import com.example.nova.data.remote.api.AuthApiService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;

/**
 * Singleton для Retrofit клиента
 */
public class RetrofitClient {
    private static Retrofit retrofit;
    private static TrackApiService trackApiService;
    private static PlaylistApiService playlistApiService;
    private static AuthApiService authApiService;

    public RetrofitClient() {}

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.SUPABASE_URL)
                    .client(getOkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create(getGson()))
                    .build();
        }
        return retrofit;
    }

    public static TrackApiService getTrackApiService() {
        if (trackApiService == null) {
            trackApiService = getRetrofit().create(TrackApiService.class);
        }
        return trackApiService;
    }

    public static PlaylistApiService getPlaylistApiService() {
        if (playlistApiService == null) {
            playlistApiService = getRetrofit().create(PlaylistApiService.class);
        }
        return playlistApiService;
    }

    public static AuthApiService getAuthApiService() {
        if (authApiService == null) {
            authApiService = getRetrofit().create(AuthApiService.class);
        }
        return authApiService;
    }

    private static OkHttpClient getOkHttpClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .addInterceptor(chain -> {
                    okhttp3.Request request = chain.request();
                    request = request.newBuilder()
                            .addHeader("Authorization", "Bearer " + Constants.SUPABASE_ANON_KEY)
                            .addHeader("Content-Type", "application/json")
                            .build();
                    return chain.proceed(request);
                })
                .build();
    }

    private static Gson getGson() {
        return new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
                .create();
    }
}
