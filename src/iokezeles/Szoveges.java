package iokezeles;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Szoveges {
    public static void main(String[] args) throws IOException {
        File allomany = new File("szoveges.txt");
        BufferedReader beolvas = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter kiiras = null;

        try {
            kiiras = new BufferedWriter(new FileWriter(allomany, true));
            String sor = "";
            System.out.println("Kérem a sorokat: ");
            do {
                sor = beolvas.readLine();
                kiiras.append(sor);
                kiiras.newLine();
            } while (!sor.equals("vege"));
            kiiras.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                kiiras.close();
                beolvas.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedReader beolvasas = new BufferedReader(new FileReader(allomany));) {
            String sor = null;
            while ((sor = beolvasas.readLine()) != null) {
                System.out.println(sor);
                String[] tomb = sor.split("as");
                for (String s: tomb) {
                    System.out.println(">> " + s);
                }

                System.out.println();

                StringTokenizer felbonto = new StringTokenizer(sor, "as");
                while (felbonto.hasMoreTokens()) {
                    System.out.println("++ " + felbonto.nextToken());
                }
            }

            Scanner bebe = new Scanner(allomany);
            bebe.useDelimiter("as");
            while (bebe.hasNext()) {
                System.out.println("-- " + bebe.next());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
