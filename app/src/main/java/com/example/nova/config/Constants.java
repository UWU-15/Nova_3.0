package com.example.nova.config;

/**
 * Константы приложения NOVA
 */
public class Constants {
    // API Configuration
    public static final String SUPABASE_URL = "https://your-project.supabase.co";
    public static final String SUPABASE_ANON_KEY = "your-anon-key";
    public static final String SUPABASE_SERVICE_ROLE_KEY = "your-service-role-key";

    // Storage buckets
    public static final String BUCKET_AUDIO = "audio";
    public static final String BUCKET_COVERS = "covers";
    public static final String BUCKET_AVATARS = "avatars";

    // Database tables
    public static final String TABLE_TRACKS = "tracks";
    public static final String TABLE_ARTISTS = "artists";
    public static final String TABLE_ALBUMS = "albums";
    public static final String TABLE_USERS = "users";
    public static final String TABLE_PLAYLISTS = "playlists";
    public static final String TABLE_PLAYLIST_TRACKS = "playlist_tracks";
    public static final String TABLE_USER_LIKES = "user_likes";
    public static final String TABLE_LISTENING_HISTORY = "listening_history";

    // API endpoints
    public static final String ENDPOINT_TRACKS = "/api/tracks";
    public static final String ENDPOINT_ARTISTS = "/api/artists";
    public static final String ENDPOINT_ALBUMS = "/api/albums";
    public static final String ENDPOINT_PLAYLISTS = "/api/playlists";
    public static final String ENDPOINT_LIKES = "/api/likes";
    public static final String ENDPOINT_HISTORY = "/api/history";
    public static final String ENDPOINT_SEARCH = "/api/search";
    public static final String ENDPOINT_RECOMMENDATIONS = "/api/recommendations";

    // Cache settings
    public static final long CACHE_DURATION_TRACKS = 3600; // 1 час в секундах
    public static final long CACHE_DURATION_ARTISTS = 7200; // 2 часа
    public static final long CACHE_DURATION_PLAYLISTS = 1800; // 30 минут

    // UI settings
    public static final int TRACKS_PER_PAGE = 20;
    public static final int SEARCH_DEBOUNCE_DELAY = 500; // мс

    // Notifications
    public static final int NOTIFICATION_ID_PLAYER = 1001;
    public static final String CHANNEL_ID_PLAYER = "nova_player_channel";
}
