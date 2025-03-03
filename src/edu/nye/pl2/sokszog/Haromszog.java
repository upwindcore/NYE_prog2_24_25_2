package edu.nye.pl2.sokszog;

public final class Haromszog extends Sokszog {

    public Haromszog(double a, double b, double c) {
        super(new double[]{a, b, c});
        if ((a + b <= c) ||
            (b + c <= a) ||
            (a + c <= b)) { // háromszög egyenlet
            throw new IllegalArgumentException("Nem lehet megszerkeszteni.");
        }
    }

    @Override public double terulet() {
        final double s = kerulet()/2;
        return Math.sqrt(s * (s - oldalak[0]) * (s - oldalak[1]) * (s - oldalak[2]));
    }
}
