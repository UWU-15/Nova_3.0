package com.example.nova.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.nova.data.models.Track;
import com.example.nova.data.models.Artist;
import com.example.nova.data.models.Playlist;
import com.example.nova.data.models.User;
import com.example.nova.data.local.dao.TrackDao;
import com.example.nova.data.local.dao.ArtistDao;
import com.example.nova.data.local.dao.PlaylistDao;
import com.example.nova.data.local.dao.UserDao;

/**
 * Room база данных NOVA
 */
@Database(entities = {Track.class, Artist.class, Playlist.class, User.class}, version = 1)
public abstract class NovaDatabase extends RoomDatabase {
    public abstract TrackDao trackDao();
    public abstract ArtistDao artistDao();
    public abstract PlaylistDao playlistDao();
    public abstract UserDao userDao();
}
