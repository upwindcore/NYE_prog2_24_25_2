public abstract class Sokszog {

    private final double[] oldalak;

    protected Sokszog(double[] oldalak) {
        this.oldalak = oldalak;
    }

    public final double kerulet() {
        double kerulet = 0.0;
        for (double oldal : oldalak) {
            kerulet += oldal;
        }
        return kerulet;
    }

    abstract double terulet();
}
