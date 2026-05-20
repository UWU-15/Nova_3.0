package com.example.nova.data.remote.api;

import com.example.nova.data.models.User;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.GET;
import retrofit2.http.Body;
import java.util.Map;

/**
 * Retrofit API сервис для авторизации
 */
public interface AuthApiService {
    @POST("/auth/v1/signup")
    Call<Map<String, Object>> signup(@Body Map<String, String> credentials);

    @POST("/auth/v1/token?grant_type=password")
    Call<Map<String, Object>> login(@Body Map<String, String> credentials);

    @POST("/auth/v1/refresh")
    Call<Map<String, Object>> refreshToken(@Body Map<String, String> token);

    @POST("/auth/v1/logout")
    Call<Void> logout();

    @GET("/api/profile")
    Call<User> getCurrentUser();

    @POST("/auth/v1/recover")
    Call<Void> resetPassword(@Body Map<String, String> email);

    @POST("/api/profile")
    Call<User> updateProfile(@Body Map<String, Object> profileData);
}
