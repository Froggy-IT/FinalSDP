package rinavori.factory;

public class PremiumService implements StreamingService {
    @Override
    public void play() {
        System.out.println("Premium Service: without ads, high quality.");
    }
}
