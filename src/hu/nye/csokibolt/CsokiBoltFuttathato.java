package hu.nye.csokibolt;

public class CsokiBoltFuttathato {
    public static void main(String[] args) {
        CsokiBolt bolt = new CsokiBolt("Csokivarazs", 10000);
        System.out.println(bolt);

        Csokolade csoki1 = new Csokolade("Milka", 200, 950, CsokiTipus.TEJ, "mogyoró", 5);
        Csokolade csoki2 = new Csokolade("Boci", 100, 550, CsokiTipus.TEJ, "nincs", 5);
        Csokolade csoki3 = new Csokolade("Boci", 250, 130, CsokiTipus.TEJ, "tiramisu", 5);
        Csokolade csoki4 = new Csokolade("Milka", 200, 950, CsokiTipus.TEJ, "mogyoró", 2);

        bolt.vesz(csoki1);
        bolt.vesz(csoki2);
        bolt.vesz(csoki2);
        bolt.elad(csoki4);
        System.out.println(bolt);

    }
}
