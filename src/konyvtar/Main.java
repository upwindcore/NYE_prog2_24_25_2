package konyvtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Konyv[] konyvek = new Konyv[5];
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String[] reszek = scanner.nextLine().split(",");
            konyvek[i] = new Konyv(reszek[0], reszek[1], Double.parseDouble(reszek[2]), Integer.parseInt(reszek[3]), Integer.parseInt(reszek[4]), KotesTipus.FUZOTT);
        }
        Konyvtar konyvtar = new Konyvtar("könyvtár1", konyvek);
//        Konyvtar konyvtar1 = new Konyvtar("könyvtár2",
//            scanner.tokens()
//                .limit(5)
//                .map(token -> token.split(","))
//                .map(reszek -> new Konyv(reszek[0], reszek[1], Double.parseDouble(reszek[2]), Integer.parseInt(reszek[3]), Integer.parseInt(reszek[4]), KotesTipus.FUZOTT))
//                .toArray(Konyv[]::new));
        //  14.
        System.out.println(konyvtar.atlagAr());
        Konyv[] dokumentumokRendezve = konyvtar.dokumentumok();
        Arrays.sort(dokumentumokRendezve);
        System.out.println(dokumentumokRendezve);

        //  17.
        System.out.println(konyvtar.atlagAr());
        Konyv[] dokumentumok = konyvtar.dokumentumok();
        List<Konyv> dokumentumList = new ArrayList<>();
        for (Konyv konyv : dokumentumok) {
            dokumentumList.add(konyv);
        }
//        dokumentumList.sort(Comparator.comparingInt(Konyv::getLeltariSzam));
        Collections.sort(dokumentumList, Comparator.comparingInt(Konyv::getLeltariSzam));
        System.out.println(dokumentumList);
//        System.out.println(Arrays.toString(Arrays.stream(dokumentumok).sorted(Comparator.comparingInt(Konyv::getLeltariSzam)).toArray(Konyv[]::new)));
    }

}
