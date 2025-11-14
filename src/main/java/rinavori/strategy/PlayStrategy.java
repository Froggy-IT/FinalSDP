package rinavori.strategy;
import rinavori.music.Playlist;
import rinavori.strategy.PlayerCallback;
public interface PlayStrategy {
    void play(Playlist playlist, PlayerCallback callback);
}
