package rinavori.visitor;
import rinavori.music.Playlist;
import rinavori.music.Track;
public class TrackInfoVisitor implements MusicVisitor {
    @Override
    public void visitTrack(Track track) {
        System.out.println("🎵 " + track.getTitle() + " — " + track.getArtist());
    }
    @Override
    public void visitPlaylist(Playlist playlist) {
        System.out.println("Playlist: " + playlist.getName());
        playlist.getTracks().forEach(this::visitTrack);
    }
}
