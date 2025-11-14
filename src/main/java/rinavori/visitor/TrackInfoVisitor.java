package rinavori.visitor;
import rinavori.music.Track;
import rinavori.music.Playlist;
public class TrackInfoVisitor implements MusicVisitor {
    @Override
    public void visitTrack(Track track) {
        System.out.println("Track: " + track.getTitle() + " — " + track.getArtist()
                + " (" + track.getDuration() + "s)");
    }
    @Override
    public void visitPlaylist(Playlist playlist) {
        System.out.println("Playlist: " + playlist.getName() + " (" + playlist.getTracks().size() + " tracks)");
        for (Track t : playlist.getTracks()) visitTrack(t);
    }
}
