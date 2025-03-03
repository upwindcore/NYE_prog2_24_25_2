package edu.nye.pl2.sokszog;

public class Teglalap extends Negyszog {
    public Teglalap(double a, double b) {
        super(a, b, a, b);
    }

    @Override public double terulet() {
        return oldalak[0] + oldalak[1];
    }
}
