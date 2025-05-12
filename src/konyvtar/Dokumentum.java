package konyvtar;

import java.util.Comparator;
import java.util.Objects;

public class Dokumentum implements Comparable<Dokumentum> {

    private int leltariSzam;

    private final String szerzo;

    private final String cim;

    private final double ar;

    private String raktariSzam;

    private boolean elerheto;

    public Dokumentum(String szerzo, String cim, double ar) {
        this.szerzo = szerzo;
        if (cim == null || cim.isBlank()) {
            throw new IllegalArgumentException("Üres cím!");
        }
        this.cim = cim;
        if (ar <= 0) {
            this.ar = 0;
        } else {
            this.ar = ar;
        }
    }

    public int getLeltariSzam() {
        return leltariSzam;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public double getAr() {
        return ar;
    }

    public String getRaktariSzam() {
        return raktariSzam;
    }

    public boolean isElerheto() {
        return elerheto;
    }

    public void setLeltariSzam(int leltariSzam) {
        this.leltariSzam = leltariSzam;
    }

    public void setRaktariSzam(String raktariSzam) {
        this.raktariSzam = raktariSzam;
    }

    public void setElerheto(boolean elerheto) {
        this.elerheto = elerheto;
    }

    @Override public String toString() {
        return "szerzo=" + szerzo +
            ", cim=" + cim +
            ", raktariSzam=" + raktariSzam +
            ", elerheto=" + elerheto;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Dokumentum that))
            return false;
        return leltariSzam == that.leltariSzam;
    }

    @Override public int hashCode() {
        return Objects.hash(leltariSzam);
    }

    @Override public int compareTo(Dokumentum o) {
        return Comparator
            .comparing(Dokumentum::getSzerzo)
            .thenComparing(Dokumentum::getCim)
            .thenComparingInt(Dokumentum::getLeltariSzam)
            .compare(this, o);
    }

}
