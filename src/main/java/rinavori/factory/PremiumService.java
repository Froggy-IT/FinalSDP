package rinavori.factory;
public class PremiumService implements StreamingService {
    @Override
    public void play() {
        System.out.println("Service: Premium plan — high quality, no ads.");
    }
}
