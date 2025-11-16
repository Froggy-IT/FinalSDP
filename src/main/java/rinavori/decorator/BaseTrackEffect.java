package rinavori.decorator;
public class BaseTrackEffect implements TrackEffect {
    @Override
    public String describe() { return "No effects"; }
    @Override
    public void apply() { System.out.println("Playing without effects."); }
}
