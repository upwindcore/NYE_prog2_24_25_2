public class Haromszog {

    private double a;

    private double b;

    private double c;

    private boolean egyenloszaru;

    public Haromszog(double a, double b, double c) {
        if (a +b > c && a + c > b && b + c > a) { // haromszog egyenlotlenseg
            this.a = a;
            this.b = b;
            this.c = c;
            egyenloszaru = (a == b) || (b == c) || (c == a);
        } else {
            throw new IllegalArgumentException("Nem lehet megszerkeszteni.");
        }
    }

    public double kerulet() {
        return a + b + c;
    }

    public boolean isEgyenloszaru() {
        return egyenloszaru;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        if (a +b > c && a + c > b && b + c > a) { // haromszog egyenlotlenseg
            this.a = a;
            egyenloszaru = (a == b) || (b == c) || (c == a);
        } else {
            throw new IllegalArgumentException("Nem lehet megszerkeszteni.");
        }
    }

    public void setB(double b) {
        if (a +b > c && a + c > b && b + c > a) { // haromszog egyenlotlenseg
            this.b = b;
            egyenloszaru = (a == b) || (b == c) || (c == a);
        } else {
            throw new IllegalArgumentException("Nem lehet megszerkeszteni.");
        }
    }

    public void setC(double c) {
        if (a +b > c && a + c > b && b + c > a) { // haromszog egyenlotlenseg
            this.c = c;
            egyenloszaru = (a == b) || (b == c) || (c == a);
        } else {
            throw new IllegalArgumentException("Nem lehet megszerkeszteni.");
        }
    }

    public double terulet() {
        return 0.0;
    }

    public void nagyitas(int hanyszoros) {
        a += hanyszoros;
        b += hanyszoros;
        c += hanyszoros;
    }

    public static void main(String[] args) {
        System.out.println("3szög");
    }
}
