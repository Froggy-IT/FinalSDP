package rinavori;
import rinavori.builder.PlaylistBuilder;
import rinavori.bridge.Player;
import rinavori.bridge.WavFileSource;
import rinavori.decorator.BaseTrackEffect;
import rinavori.decorator.EchoEffect;
import rinavori.factory.ServiceFactory;
import rinavori.music.Playlist;
import rinavori.music.Track;
import rinavori.strategy.*;
import rinavori.visitor.*;
import java.util.Scanner;
public class Main {
    private static Player player;
    private static Playlist playlist;
    private static PlayStrategy strategy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose service (free/premium): ");
        String serviceChoice = sc.nextLine().trim();
        new ServiceFactory().getService(serviceChoice).play();
        playlist = new PlaylistBuilder()
                .create("Rinavori Mix")
                .add("Lady Killer", "Doja Cat", 210)
                .add("S&M", "Rihanna", 220)
                .add("Ya lyublyu tebya", "Rauf & Faik", 200)
                .build();
        player = new Player(new WavFileSource());
        strategy = new NormalPlay();
        boolean run = true;
        while (run) {
            printMenu();
            String cmd = sc.nextLine().trim();
            switch (cmd) {
                case "1": showPlaylist(); break;
                case "2": playPlaylist(); break;
                case "3": toggleStrategy(sc); break;
                case "4": playSingleTrack(sc); break;
                case "5": player.stop(); break;
                case "6": demoDecorator(); break;
                case "7": visitInfo(); break;
                case "8": visitDuration(); break;
                case "0": player.stop(); run = false; break;
                default: System.out.println("Unknown option"); break;
            }
        }
        sc.close();
        System.out.println("Goodbye!");
    }
    private static void printMenu() {
        System.out.println("\n Rinavori Menu ");
        System.out.println("1) Show playlist");
        System.out.println("2) Play playlist (strategy)");
        System.out.println("3) Switch strategy (normal/shuffle)");
        System.out.println("4) Play specific track (1..3)");
        System.out.println("5) Stop playback");
        System.out.println("6) Decorator demo (Echo)");
        System.out.println("7) Visitor: track info");
        System.out.println("8) Visitor: playlist duration");
        System.out.println("0) Exit");
        System.out.print("Choose: ");
    }
    private static void showPlaylist() {
        System.out.println("Playlist: " + playlist.getName());
        int i = 1;
        for (Track t : playlist.getTracks()) {
            System.out.printf("%d) %s%n", i++, t);
        }
    }
    private static void playPlaylist() {
        System.out.println("Playing playlist with current strategy...");
        strategy.play(playlist, t -> {
            String resource = mapTitleToFile(t.getTitle());
            System.out.println("Now playing: " + t.getTitle());
            player.play(resource);
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        });
    }
    private static void toggleStrategy(Scanner sc) {
        System.out.print("Enter normal or shuffle: ");
        String v = sc.nextLine().trim();
        if ("shuffle".equalsIgnoreCase(v)) {
            strategy = new ShufflePlay();
            System.out.println("Strategy set to shuffle.");
        } else {
            strategy = new NormalPlay();
            System.out.println("Strategy set to normal.");
        }
    }
    private static void playSingleTrack(Scanner sc) {
        System.out.print("Choose track number (1..3): ");
        String n = sc.nextLine().trim();
        int idx;
        try { idx = Integer.parseInt(n); } catch (Exception e) { System.out.println("Bad number"); return; }
        if (idx < 1 || idx > playlist.getTracks().size()) { System.out.println("Out of range"); return; }
        String resource = mapTitleToFile(playlist.getTracks().get(idx - 1).getTitle());
        player.play(resource);
    }
    private static void demoDecorator() {
        var base = new BaseTrackEffect();
        var echo = new EchoEffect(base);
        System.out.println("Decorator description: " + echo.describe());
        echo.apply();
    }
    private static void visitInfo() {
        var visitor = new TrackInfoVisitor();
        visitor.visitPlaylist(playlist);
    }
    private static void visitDuration() {
        var visitor = new PlaylistDurationVisitor();
        visitor.visitPlaylist(playlist);
    }
    private static String mapTitleToFile(String title) {
        String t = title.toLowerCase();
        if (t.contains("lady")) return "lady_killer.wav";
        if (t.contains("s&m") || t.contains("sm")) return "sm.wav";
        return "ya_lyublyu_tebya.wav";
    }
}

