public final class Haromszog extends Sokszog {

    public Haromszog(double a, double b, double c) {
        super(new double[]{a, b, c});
        if ((a + b <= c) ||
            (b + c <= a) ||
            (a + c <= b)) { // háromszög egyenlet
            throw new IllegalArgumentException("Nem lehet megszerkeszteni.");
        }
    }

    @Override double terulet() {
        return 0;
    }
}
