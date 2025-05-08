package edu.nye.pl2.komp.komp;

import edu.nye.pl2.komp.jarmu.Jarmu;

public interface KompInterface {
    KompStatusz getStatusz();
    boolean megtelt();
    void elindul();
    void felhajt(Jarmu jarmu);
    void kihajozik();
}
