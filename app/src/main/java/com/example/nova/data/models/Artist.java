package com.example.nova.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;

/**
 * Модель исполнителя
 */
@Entity(tableName = "artists")
public class Artist {
    @PrimaryKey
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("bio")
    public String bio;

    @SerializedName("photo_url")
    public String photoUrl;

    @SerializedName("created_at")
    public String createdAt;

    @SerializedName("updated_at")
    public String updatedAt;

    public Artist() {}

    public Artist(String id, String name, String bio, String photoUrl) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
