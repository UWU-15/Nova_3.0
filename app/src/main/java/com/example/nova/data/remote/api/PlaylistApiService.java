package com.example.nova.data.remote.api;

import com.example.nova.data.models.Playlist;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.DELETE;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Body;
import java.util.List;
import java.util.Map;

/**
 * Retrofit API сервис для работы с плейлистами
 */
public interface PlaylistApiService {
    @GET("/api/playlists")
    Call<List<Playlist>> getUserPlaylists();

    @POST("/api/playlists")
    Call<Playlist> createPlaylist(@Body Map<String, Object> playlistData);

    @GET("/api/playlists/{id}")
    Call<Playlist> getPlaylistById(@Path("id") String playlistId);

    @PUT("/api/playlists/{id}")
    Call<Playlist> updatePlaylist(@Path("id") String playlistId, @Body Map<String, Object> updates);

    @DELETE("/api/playlists/{id}")
    Call<Void> deletePlaylist(@Path("id") String playlistId);

    @POST("/api/playlists/{id}/tracks")
    Call<Void> addTrackToPlaylist(@Path("id") String playlistId, @Query("track_id") String trackId);

    @DELETE("/api/playlists/{id}/tracks")
    Call<Void> removeTrackFromPlaylist(@Path("id") String playlistId, @Query("track_id") String trackId);
}
