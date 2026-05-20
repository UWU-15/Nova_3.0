package com.example.nova.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;

/**
 * Модель трека NOVA
 */
@Entity(tableName = "tracks")
public class Track {
    @PrimaryKey
    public String id;

    @SerializedName("title")
    public String title;

    @SerializedName("artist_id")
    public String artistId;

    @SerializedName("album_id")
    public String albumId;

    @SerializedName("duration")
    public int duration; // в секундах

    @SerializedName("audio_url")
    public String audioUrl;

    @SerializedName("cover_url")
    public String coverUrl;

    @SerializedName("genre")
    public String genre;

    @SerializedName("play_count")
    public int playCount;

    @SerializedName("release_date")
    public String releaseDate;

    @SerializedName("is_active")
    public boolean isActive;

    @SerializedName("created_at")
    public String createdAt;

    @SerializedName("updated_at")
    public String updatedAt;

    // Дополнительные поля (не хранятся в БД)
    public transient String artistName;
    public transient String albumTitle;
    public transient boolean isLiked;

    public Track() {}

    public Track(String id, String title, String artistId, String albumId, int duration,
                 String audioUrl, String coverUrl, String genre, boolean isActive) {
        this.id = id;
        this.title = title;
        this.artistId = artistId;
        this.albumId = albumId;
        this.duration = duration;
        this.audioUrl = audioUrl;
        this.coverUrl = coverUrl;
        this.genre = genre;
        this.isActive = isActive;
        this.playCount = 0;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", artistName='" + artistName + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}
