package konyvtar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Konyvtar implements Gyujtemeny<Konyv> {

    private String nev;

    private int leltariSzam = 0;

//    private List<Konyv> leltar;

    private Map<Character, List<Konyv>> raktar;

    public Konyvtar(String nev) {
        this.nev = nev;
    }

    public Konyvtar(String nev, Konyv[] konyvek) {
        this.nev = nev;
        for (Konyv konyv : konyvek) {
            felvesz(konyv);
        }
    }

    @Override public void felvesz(Konyv dokumentum) {
        dokumentum.setLeltariSzam(++leltariSzam);
//        leltar.add(dokumentum);
//        dokumentum.setLeltariSzam(leltar.size());
        char betujel = getBetujel(dokumentum);
        raktar.putIfAbsent(betujel, new LinkedList<>());
        raktar.get(betujel).add(dokumentum);
        dokumentum.setRaktariSzam(betujel + String.valueOf(raktar.get(betujel).size()));
    }

    private char getBetujel(Konyv dokumentum) {
        return (char)('A' + (dokumentum.getGerincMeret() / 5));
    }

    @Override public double atlagAr() {
        Konyv[] konyvek = dokumentumok();
        if (konyvek.length == 0) {
            return 0;
        } else {
            return Arrays.stream(konyvek).mapToDouble(Konyv::getAr).average().getAsDouble();
        }
    }

    @Override public Konyv[] dokumentumok() {
//        return leltar.toArray(new Konyv[0]);
        return raktar.values().stream().flatMap(Collection::stream).toArray(Konyv[]::new);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

}
