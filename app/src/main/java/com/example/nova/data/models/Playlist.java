package com.example.nova.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Модель плейлиста
 */
@Entity(tableName = "playlists")
public class Playlist {
    @PrimaryKey
    public String id;

    @SerializedName("user_id")
    public String userId;

    @SerializedName("name")
    public String name;

    @SerializedName("description")
    public String description;

    @SerializedName("cover_url")
    public String coverUrl;

    @SerializedName("is_public")
    public boolean isPublic;

    @SerializedName("created_at")
    public String createdAt;

    @SerializedName("updated_at")
    public String updatedAt;

    // Дополнительные поля (не хранятся в БД)
    public transient List<Track> tracks;
    public transient int trackCount;

    public Playlist() {}

    public Playlist(String id, String userId, String name, String description, boolean isPublic) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.isPublic = isPublic;
        this.trackCount = 0;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", trackCount=" + trackCount +
                '}';
    }
}
