package rinavori.factory;

public class FreeService implements StreamingService {
    @Override
    public void play() {
        System.out.println("Free Service: with ads.");
    }
}
