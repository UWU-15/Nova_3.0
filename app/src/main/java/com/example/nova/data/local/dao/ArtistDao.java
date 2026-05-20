package com.example.nova.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.example.nova.data.models.Artist;
import java.util.List;

/**
 * DAO для работы с исполнителями в Room БД
 */
@Dao
public interface ArtistDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertArtist(Artist artist);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertArtists(List<Artist> artists);

    @Update
    void updateArtist(Artist artist);

    @Delete
    void deleteArtist(Artist artist);

    @Query("SELECT * FROM artists WHERE id = :artistId")
    Artist getArtistById(String artistId);

    @Query("SELECT * FROM artists ORDER BY name ASC")
    List<Artist> getAllArtists();

    @Query("SELECT * FROM artists WHERE name LIKE '%' || :query || '%'")
    List<Artist> searchArtists(String query);

    @Query("SELECT COUNT(*) FROM artists")
    int getArtistsCount();

    @Query("DELETE FROM artists")
    void deleteAllArtists();
}
