package rinavori.visitor;
import rinavori.music.Track;
import rinavori.music.Playlist;
public interface MusicVisitor {
    void visitTrack(Track track);
    void visitPlaylist(Playlist playlist);
}
