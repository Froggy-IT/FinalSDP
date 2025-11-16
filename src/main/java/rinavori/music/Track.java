package rinavori.music;
public class Track {
    private final String title;
    private final String artist;
    private final int duration; 
    public Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDuration() { return duration; }
    @Override
    public String toString() {
        return title + " - " + artist + " (" + duration + "s)";
    }
}
