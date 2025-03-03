package edu.nye.pl2;

import edu.nye.pl2.sokszog.*;

public class Main {

    public static void main(String[] args) {
        // haromszog
        Haromszog haromszog = new Haromszog(3,4,5);
        kiirKerulet("háromszög", new Haromszog(3, 4, 5));
        kiirTerulet("háromszög", new Haromszog(3, 4, 5));

        kiirKerulet("négyzet", new Negyzet(2));
        kiirTerulet("négyzet", new Negyzet(2));
        kiirKerulet("téglalap", new Teglalap(2, 2));
        kiirTerulet("téglalap", new Teglalap(2, 2));
        kiirKerulet("ötszög", new SzabalyosOtszog(7));
        kiirKerulet("hatszög", new SzabalyosHatszog(7));
    }

    private static void kiirTerulet(String tipus, Sokszog sokszog) {
        double terulet = sokszog.terulet();
        System.out.println("A " + tipus + " területe: " + terulet);
    }

    private static void kiirKerulet(String tipus, Sokszog sokszog) {
        System.out.println("A " + tipus + " kerülete: " + sokszog.kerulet());
    }
}
