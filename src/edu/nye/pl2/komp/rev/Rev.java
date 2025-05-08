package edu.nye.pl2.komp.rev;

import edu.nye.pl2.komp.komp.KompStatusz;
import edu.nye.pl2.komp.jarmu.Jarmu;
import edu.nye.pl2.komp.part.PartInterface;

public class Rev implements RevInterface {
    @Override public PartInterface getPart(KompStatusz statusz) {
        return null;
    }

    @Override public void erkezik(KompStatusz part, Jarmu jarmu) {
        System.out.println("Érkezik: %s part: %s%n", jarmu.getRendszam(), part);
    }
}
