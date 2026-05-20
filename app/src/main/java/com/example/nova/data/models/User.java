package com.example.nova.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Модель пользователя
 */
@Entity(tableName = "users")
public class User {
    @PrimaryKey
    public String id;

    @SerializedName("email")
    public String email;

    @SerializedName("username")
    public String username;

    @SerializedName("full_name")
    public String fullName;

    @SerializedName("avatar_url")
    public String avatarUrl;

    @SerializedName("bio")
    public String bio;

    @SerializedName("created_at")
    public String createdAt;

    @SerializedName("updated_at")
    public String updatedAt;

    @SerializedName("last_login")
    public String lastLogin;

    @SerializedName("is_active")
    public boolean isActive;

    // Дополнительные поля (не хранятся в БД)
    public transient List<String> favoriteGenres;
    public transient int totalPlayTime;

    public User() {}

    public User(String id, String email, String username, String fullName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.isActive = true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
