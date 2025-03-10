package hu.nye.csokibolt;

abstract class Edesseg {
    private String nev;
    private int suly;
    private int ar;

    public Edesseg() {
    }

    public Edesseg(String nev, int suly, int ar) {
        this.nev = nev;
        this.suly = suly;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }
}
