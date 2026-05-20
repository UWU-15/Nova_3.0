package com.example.nova.data.remote.api;

import com.example.nova.data.models.Track;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.DELETE;
import retrofit2.http.Path;
import retrofit2.http.Query;
import java.util.List;

/**
 * Retrofit API сервис для работы с треками
 */
public interface TrackApiService {
    @GET("/api/tracks")
    Call<List<Track>> getTracks(@Query("limit") int limit);

    @GET("/api/tracks/popular")
    Call<List<Track>> getPopularTracks(@Query("limit") int limit);

    @GET("/api/tracks/new")
    Call<List<Track>> getNewTracks(@Query("limit") int limit);

    @GET("/api/tracks/{id}")
    Call<Track> getTrackById(@Path("id") String trackId);

    @GET("/api/tracks/search")
    Call<List<Track>> searchTracks(@Query("q") String query);

    @GET("/api/tracks/genre/{genre}")
    Call<List<Track>> getTracksByGenre(@Path("genre") String genre);

    @POST("/api/likes")
    Call<Void> likeTrack(@Query("track_id") String trackId);

    @DELETE("/api/likes")
    Call<Void> unlikeTrack(@Query("track_id") String trackId);

    @POST("/api/history")
    Call<Void> addToListeningHistory(@Query("track_id") String trackId, @Query("duration") int duration);
}
