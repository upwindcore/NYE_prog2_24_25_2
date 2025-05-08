package edu.nye.pl2.komp.part;

import edu.nye.pl2.komp.komp.KompStatusz;
import edu.nye.pl2.komp.jarmu.Jarmu;

public class PartInterface {
    KompStatusz getStatusz();
    void erkezik(Jarmu jarmu);
    Jarmu sorrakerul();
    boolean ures();
}
