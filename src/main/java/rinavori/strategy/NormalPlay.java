package rinavori.strategy;
import rinavori.music.Playlist;
import rinavori.music.Track;
public class NormalPlay implements PlayStrategy {
    @Override
    public void play(Playlist playlist, PlayerCallback callback) {
        for (Track t : playlist.getTracks()) callback.onPlay(t);
    }
}
