package edu.nye.pl2.komp.rev;

import edu.nye.pl2.komp.komp.KompStatusz;
import edu.nye.pl2.komp.jarmu.Jarmu;
import edu.nye.pl2.komp.part.PartInterface;

public interface RevInterface {
    PartInterface getPart(KompStatusz statusz);
    void erkezik(KompStatusz part, Jarmu jarmu);
}
