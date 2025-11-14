package rinavori.strategy;
import rinavori.music.Playlist;
public class NormalPlay implements PlayStrategy {
    @Override
    public void play(Playlist playlist) {
        playlist.getTracks().forEach(t -> System.out.println("▶ " + t.getTitle()));
    }
}
