package com.example.nova.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.example.nova.data.models.Playlist;
import java.util.List;

/**
 * DAO для работы с плейлистами в Room БД
 */
@Dao
public interface PlaylistDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPlaylist(Playlist playlist);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPlaylists(List<Playlist> playlists);

    @Update
    void updatePlaylist(Playlist playlist);

    @Delete
    void deletePlaylist(Playlist playlist);

    @Query("DELETE FROM playlists WHERE id = :playlistId")
    void deletePlaylistById(String playlistId);

    @Query("SELECT * FROM playlists WHERE id = :playlistId")
    Playlist getPlaylistById(String playlistId);

    @Query("SELECT * FROM playlists WHERE user_id = :userId ORDER BY updated_at DESC")
    List<Playlist> getUserPlaylists(String userId);

    @Query("SELECT * FROM playlists WHERE is_public = 1 ORDER BY updated_at DESC LIMIT :limit")
    List<Playlist> getPublicPlaylists(int limit);

    @Query("SELECT * FROM playlists WHERE name LIKE '%' || :query || '%'")
    List<Playlist> searchPlaylists(String query);

    @Query("SELECT COUNT(*) FROM playlists WHERE user_id = :userId")
    int getUserPlaylistsCount(String userId);

    @Query("DELETE FROM playlists WHERE user_id = :userId")
    void deleteUserPlaylists(String userId);
}
