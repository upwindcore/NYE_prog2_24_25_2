package iokezeles;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Allomanyos {
    public static void main(String[] args) throws IOException {
        File allomany = new File("valami.txt");
        System.out.println(System.getProperty("user.dir"));
        /*
        System.setProperty("user.dir", "C:\\temp");
        System.out.println(System.getProperty("user.dir"));
        */

        System.out.println(allomany.getAbsolutePath());
        try {
            System.out.println(allomany.getCanonicalPath());
            boolean letrehzva = allomany.createNewFile();
            File temp = File.createTempFile("nyeorai", ".tmp");
            System.out.println(temp.getCanonicalPath());
            temp.deleteOnExit();
            if (temp.exists()) {
                System.out.println("Létezik");
            }
            allomany.delete();
            File regi = new File("old.txt");
            regi.createNewFile();
            File uj = new File("uj.txt");
            regi.renameTo(uj);

            File konyvtar = new File("c:\\");
            File[] gyoker = konyvtar.listFiles();
            for (File f: gyoker) {
                System.out.println(
                        (f.isFile()?"-":"d") + (f.canRead()?"r":"-") + (f.canWrite()?"w":"-") + "------" +
                        (f.length()/1024) + "kB " + (f.isFile()?f.getName():f.getName().toUpperCase())
                );
            }

            FileFilter szuro = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.isFile()) {
                        String nev = pathname.getName().toLowerCase();
                        if (nev.endsWith(".sys")) {
                            return true;
                        }
                    }
                    return false;
                }
            };

            System.out.println("--------- SYS ---------");
            gyoker = konyvtar.listFiles();
            for (File f: gyoker) {
                System.out.println(
                        (f.isFile()?"-":"d") + (f.canRead()?"r":"-") + (f.canWrite()?"w":"-") + "------" +
                                (f.length()/1024) + "kB " + (f.isFile()?f.getName():f.getName().toUpperCase())
                );
            }

        } catch (IOException ex) {
            System.out.println("Hiba!");
        }
    }
}
