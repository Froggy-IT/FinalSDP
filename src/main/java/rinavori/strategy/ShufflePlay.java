package rinavori.strategy;
import rinavori.music.Playlist;
import java.util.Collections;
public class ShufflePlay implements PlayStrategy {
    @Override
    public void play(Playlist playlist) {
        Collections.shuffle(playlist.getTracks());
        playlist.getTracks().forEach(t -> System.out.println("randm " + t.getTitle()));
    }
}
