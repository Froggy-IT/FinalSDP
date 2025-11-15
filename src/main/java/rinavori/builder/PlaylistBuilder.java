package rinavori.builder;

import rinavori.music.Playlist;
import rinavori.music.Track;

public class PlaylistBuilder {
    private Playlist playlist;

    public PlaylistBuilder create(String name) {
        playlist = new Playlist(name);
        return this;
    }

    public PlaylistBuilder add(String title, String artist, int duration) {
        playlist.addTrack(new Track(title, artist, duration));
        return this;
    }

    public Playlist build() {
        return playlist;
    }
}
