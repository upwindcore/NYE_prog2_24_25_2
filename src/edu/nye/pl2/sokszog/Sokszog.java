package edu.nye.pl2.sokszog;

public abstract class Sokszog {

    public final double[] oldalak;

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

    public abstract double terulet();
}
