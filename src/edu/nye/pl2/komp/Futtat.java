package edu.nye.pl2.komp;

import edu.nye.pl2.komp.jarmu.Szemelygepkocsi;
import edu.nye.pl2.komp.komp.KompStatusz;
import edu.nye.pl2.komp.rev.Rev;
import edu.nye.pl2.komp.rev.RevInterface;

import java.util.Scanner;

public class Futtat {
    public static void main(String[] args) {
        RevInterface rev = rev();
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a járűvet B|J, rendszám formátumban!");
        String sor = scanner.nextLine();
        while (!"x".equals(sor)) {
            String[] reszek = sor.split(",");
            if (reszek.length <= 2 || (!"B".equals(reszek[0]) && !"J".equals(reszek[0]))) {
                System.out.println("Hibás bemenet!");
            } else {
                rev.erkezik(reszek[0].equals("B") ? KompStatusz.BAL_PART : KompStatusz.JOBB_PART,
                    new Szemelygepkocsi(reszek[1]));
            }
            System.out.println("Kérem a járűvet B|J, rendszám formátumban!");
            sor = scanner.nextLine();

        }
    }

    private RevInterface rev() {
        return new Rev();
    };
}
