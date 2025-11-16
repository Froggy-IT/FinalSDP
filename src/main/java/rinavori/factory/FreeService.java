package rinavori.factory;
public class FreeService implements StreamingService {
    @Override
    public void play() {
        System.out.println("Service: Free plan - ads may appear and bitrate is lower.");
    }
}
