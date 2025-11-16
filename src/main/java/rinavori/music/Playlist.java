package rinavori.music;
import java.util.ArrayList;
import java.util.List;
public class Playlist {
    private final String name;
    private final List<Track> tracks = new ArrayList<>();

    public Playlist(String name) { this.name = name; }

    public void addTrack(Track t) { tracks.add(t); }
    public List<Track> getTracks() { return new ArrayList<>(tracks); }
    public String getName() { return name; }
}
