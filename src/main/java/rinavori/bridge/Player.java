package rinavori.bridge;
public class Player {
    private final AudioSource source;
    public Player(AudioSource source) { this.source = source; }
    public void play(String resourceName) { source.play(resourceName); }
    public void stop() { source.stop(); }
}
