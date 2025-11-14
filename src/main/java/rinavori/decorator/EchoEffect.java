package rinavori.decorator;

public class EchoEffect implements TrackEffect {
    private TrackEffect effect;

    public EchoEffect(TrackEffect effect) { this.effect = effect; }

    @Override
    public void apply() {
        effect.apply();
        System.out.println("Added effect ECHO");
    }
}
