package org.example;

public class Elso {
    
    public String nev;
    
    public Elso(String nev) {
        this.nev = nev;
    }
    
    public void nevhezHozzaAd(String tovabbi) {
        this.nev = nev + " " + tovabbi;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello \"nice\" World!");
        
        Elso elsoNev = new Elso("Zúz");
        Elso masodikNev = new Elso("Senki");
        
        System.out.println(elsoNev.nev);
        System.out.println(masodikNev.nev);
        
        elsoNev.nevhezHozzaAd("Mara");
        System.out.println(elsoNev.nev);
    }
}
