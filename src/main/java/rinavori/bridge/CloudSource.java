package rinavori.bridge;
public class CloudSource implements AudioSource {
    @Override
    public void load(String trackName) {
        System.out.println("streaming from the cloud: " + trackName);
    }
}
