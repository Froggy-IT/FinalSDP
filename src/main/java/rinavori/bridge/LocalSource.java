package rinavori.bridge;
public class LocalSource implements AudioSource {
    @Override
    public void load(String trackName) {
        System.out.println("downloading a track locally:" + trackName);
    }
}
