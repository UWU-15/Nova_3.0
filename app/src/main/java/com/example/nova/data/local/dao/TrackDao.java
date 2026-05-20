package com.example.nova.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.example.nova.data.models.Track;
import java.util.List;

/**
 * DAO для работы с треками в Room БД
 */
@Dao
public interface TrackDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTrack(Track track);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTracks(List<Track> tracks);

    @Update
    void updateTrack(Track track);

    @Delete
    void deleteTrack(Track track);

    @Query("DELETE FROM tracks WHERE id = :trackId")
    void deleteTrackById(String trackId);

    @Query("SELECT * FROM tracks WHERE id = :trackId")
    Track getTrackById(String trackId);

    @Query("SELECT * FROM tracks ORDER BY play_count DESC LIMIT :limit")
    List<Track> getPopularTracks(int limit);

    @Query("SELECT * FROM tracks ORDER BY created_at DESC LIMIT :limit")
    List<Track> getNewTracks(int limit);

    @Query("SELECT * FROM tracks WHERE genre = :genre LIMIT :limit")
    List<Track> getTracksByGenre(String genre, int limit);

    @Query("SELECT * FROM tracks WHERE artist_id = :artistId")
    List<Track> getTracksByArtist(String artistId);

    @Query("SELECT * FROM tracks WHERE album_id = :albumId")
    List<Track> getTracksByAlbum(String albumId);

    @Query("SELECT * FROM tracks WHERE title LIKE '%' || :query || '%' OR artist_id LIKE '%' || :query || '%'")
    List<Track> searchTracks(String query);

    @Query("SELECT * FROM tracks WHERE is_active = 1")
    List<Track> getAllActiveTracks();

    @Query("SELECT COUNT(*) FROM tracks")
    int getTracksCount();

    @Query("DELETE FROM tracks")
    void deleteAllTracks();
}
