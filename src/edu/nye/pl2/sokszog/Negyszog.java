package edu.nye.pl2.sokszog;

public abstract class Negyszog extends Sokszog {

    public Negyszog(double a, double b, double c, double d) {
        super(new double[] {a, b, c, d});
    }

    @Override public double terulet() { return 0; }
}
