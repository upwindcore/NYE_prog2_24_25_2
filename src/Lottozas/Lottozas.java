package Lottozas;

import java.util.Arrays;

public class Lottozas {
    public static void main(String[] args) {
        int[] szamok = {1, 2, 3, 42, 5};
        int[] nyeroszamok = new int[];
//        OtosLotto otos = new OtosLotto(szamok);

        OtosLotto otos = new OtosLotto();
        otos.kitolt(szamok);
        System.out.println(otos);
        System.out.println(Arrays.toString(szamok));
        nyeroszamok = otos.huzas();
        System.out.println("A nyerő számok: " + Arrays.toString(nyeroszamok));
        System.out.println("Találataim száma: " + otos.ellenorzes(otos.getSzelveny(), nyeroszamok));
    }
}
