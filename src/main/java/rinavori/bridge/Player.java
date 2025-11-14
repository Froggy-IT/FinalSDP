package rinavori.bridge;
public abstract class Player {
    protected AudioSource source;
    public Player(AudioSource source) { this.source = source; }
    public abstract void play(String trackName);
}
