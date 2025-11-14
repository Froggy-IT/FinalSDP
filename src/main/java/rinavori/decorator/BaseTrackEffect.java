package rinavori.decorator;

public class BaseTrackEffect implements TrackEffect {
    @Override
    public void apply() {
        System.out.println("Playing without sound effects");
    }
}
