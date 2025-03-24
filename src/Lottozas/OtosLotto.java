package Lottozas;

import java.util.Arrays;

public class OtosLotto extends Lotto implements Szelveny{

    private static final int DARAB = 5;
    private int[] szelveny = new int[DARAB];

    public OtosLotto() {
    }

    public OtosLotto(int[] szelveny) {
        this.szelveny = szelveny;
    }

    public OtosLotto(int sz1, int sz2, int sz3, int sz4, int sz5) {
        this.szelveny[0] = sz1;
        this.szelveny[1] = sz2;
        this.szelveny[2] = sz3;
        this.szelveny[3] = sz4;
        this.szelveny[4] = sz5;
    }

    public int[] getSzelveny() {
        return szelveny;
    }

    public void setSzelveny(int[] szelveny) {
        this.szelveny = szelveny;
    }

    @Override
    public void kitolt(int[] szamok) {
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < 1 || szamok[i] > 90) {
                System.out.println("Az " + i + ". szám hibás");
            } else {
                for (int j = 0; j < i; j++) {
                    if (szamok[i] == szamok[j]) {
                        System.out.println("Ez a szám már a a szelvényen van");
                        return;
                    }
                }
                System.out.println("A " + szamok[i] + " szám rögzítésre került");
                this.szelveny[i] = szamok[i];
            }
        }
    }

    @Override
    public int[] huzas() {
        int[] huzottSzamok = new int[DARAB];
        boolean bennevan = false;
        int szam;
        for (int i = 0; i < DARAB; i++) {
            do {
                bennevan = false;
                szam = (int) (Math.random() * 90) + 1;
                for (int j = 0; j < i; j++) {
                    if (huzottSzamok[j] == szam) {
                        bennevan = true;
                        break;
                    }
                }
            } while(bennevan);
            huzottSzamok[i] = szam;
        }
        Arrays.sort(huzottSzamok);
        return huzottSzamok;

    }

    @Override
    public int ellenorzes(int[] szelveny, int[] kihuzottak) {
        int talalatok = 0;
        /*
        for (int i = 0; i < DARAB; i++) {
            for (int j = 0; j < DARAB; j++) {
                if (szelveny[i] == kihuzottak[j]) {
                    talalatok++;
                }
            }
        }

 */
        for (int i = 0; i < DARAB; i++) {
            if (Arrays.binarySearch(szelveny, kihuzottak[i] >= 0) {
                talalatok++;
            }
        }
        return talalatok;
    }

    @Override
    public String toString() {
        return "OtosLotto{" +
                "szelveny=" + Arrays.toString(szelveny) +
                '}' + super.toString();
    }
}
