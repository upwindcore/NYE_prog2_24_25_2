public class Negyzet extends Sokszog {
    public Negyzet(double a) {
        super(new double[] {a, a, a, a});
    }

    @Override double terulet() {
        return 0;
    }
}
