package rinavori.strategy;
import rinavori.music.Playlist;
import rinavori.music.Track;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ShufflePlay implements PlayStrategy {
    @Override
    public void play(Playlist playlist, PlayerCallback callback) {
        List<Track> shuffled = new ArrayList<>(playlist.getTracks());
        Collections.shuffle(shuffled);
        for (Track t : shuffled) callback.onPlay(t);
    }
}
