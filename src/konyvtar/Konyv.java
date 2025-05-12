package konyvtar;

public class Konyv extends Dokumentum {

    private final int oldalSzam;

    private final int gerincMeret;

    private final KotesTipus kotesTipus;

    public Konyv(String szerzo, String cim, double ar, int oldalSzam, int gerincMeret, KotesTipus kotesTipus) {
        super(szerzo, cim, ar);
        this.oldalSzam = oldalSzam;
        this.gerincMeret = gerincMeret;
        this.kotesTipus = kotesTipus;
    }

    public int getOldalSzam() {
        return oldalSzam;
    }

    public int getGerincMeret() {
        return gerincMeret;
    }

    public KotesTipus getKotesTipus() {
        return kotesTipus;
    }

    @Override public String toString() {
        return super.toString() +
            ", oldalSzam=" + oldalSzam +
            ", gerincMeret=" + gerincMeret +
            ", kotesTipus=" + kotesTipus;
    }
}
