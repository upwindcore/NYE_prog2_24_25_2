public class Main {

    public static void main(String[] args) {
//        double a, b, c;
//        a = 3;
//        b = 4;
//        c = 5;
//        System.out.println("A kerület:" + (a + b + c));
        Haromszog haromszog = new Haromszog(3, 4, 5);
//        haromszog.setA(3);
//        haromszog.setB(4);
//        haromszog.setC(5);
        System.out.println("haromszog kerulet: " + haromszog.kerulet());
        System.out.println("egyenlőszárú: " + haromszog.isEgyenloszaru());
        Haromszog haromszog1 = new Haromszog(1, 1, 1);
        System.out.println("haromszog kerulet: " + haromszog1.kerulet());
        System.out.println("egyenlőszárú: " + haromszog1.isEgyenloszaru());
        haromszog1.nagyitas(3);
        System.out.println("haromszog kerulet: " + haromszog1.kerulet());
        System.out.println("egyenlőszárú: " + haromszog1.isEgyenloszaru());
//        a = 2;
//        b = 2;
//        c = 1;
//        System.out.println("A kerület:" + (a + b + c));
//        b = 5;
//        System.out.println("A kerület:" + (a + b + c));
    }

    double haromSzogKerulet(double a, double b, double c) {
        return a + b + c;
    }

    double negySzogKerulet(double a, double b, double c, double d) {
        return a + b + c;
    }

}
