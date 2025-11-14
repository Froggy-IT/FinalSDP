package rinavori;
import rinavori.factory.*;
import rinavori.builder.*;
import rinavori.music.*;
import rinavori.bridge.*;
import rinavori.strategy.*;
import rinavori.visitor.*;
public class Main {
    public static void main(String[] args) {
        StreamingService service = new ServiceFactory().getService("premium");
        service.play();

        Playlist playlist = new PlaylistBuilder()
                .create("Rinavori Mix")
                .add("aura", "Yoe Mase", 220)
                .add("Shelter", "Porter Robinson", 185)
                .build();
        Player player = new MusicPlayer(new CloudSource());
        PlayStrategy strategy = new ShufflePlay();
        strategy.play(playlist);
        new TrackInfoVisitor().visitPlaylist(playlist);
        new PlaylistDurationVisitor().visitPlaylist(playlist);
    }
}
