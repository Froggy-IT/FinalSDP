package rinavori.decorator;
public class EchoEffect implements TrackEffect {
    private final TrackEffect inner;
    public EchoEffect(TrackEffect inner) { this.inner = inner; }
    @Override
    public String describe() { return inner.describe() + " + Echo"; }
    @Override
    public void apply() {
        inner.apply();
        System.out.println("Applying: Echo (simulated).");
    }
}
