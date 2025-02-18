public class Main {

    public static void main(String[] args) {
        kiirKerulet("háromszög", new Haromszog(2, 3, 4));
        kiirKerulet("négyszög", new Negyszog(2, 3, 4, 1));
        kiirKerulet("négyzet", new Negyzet(2));
        kiirKerulet("ötszög", new SzabalyosOtszog(7));
        kiirKerulet("hatszög", new SzabalyosHatszog(7));
    }

    private static void kiirKerulet(String tipus, Sokszog sokszog) {
        System.out.println(tipus + ": " + sokszog.kerulet());
    }
}
