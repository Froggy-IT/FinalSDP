package rinavori.bridge;
public class MusicPlayer extends Player {
    public MusicPlayer(AudioSource source) { super(source); }
    @Override
    public void play(String trackName) {
        source.load(trackName);
        System.out.println(" Playback: " + trackName);
    }
}
