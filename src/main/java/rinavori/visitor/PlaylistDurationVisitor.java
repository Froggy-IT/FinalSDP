package rinavori.visitor;
import rinavori.music.Playlist;
public class PlaylistDurationVisitor implements MusicVisitor {
    @Override public void visitTrack(rinavori.music.Track track) {
    }
    @Override public void visitPlaylist(Playlist playlist) {
        int total = playlist.getTracks().stream().mapToInt(t -> t.getDuration()).sum();
        System.out.println("Total playlist duration: " + total + " seconds");
    }
}
