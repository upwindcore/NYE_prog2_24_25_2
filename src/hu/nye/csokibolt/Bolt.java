package hu.nye.csokibolt;

public abstract class Bolt {
    private String boltNev;
    private int forgotoket;

    public Bolt(String boltNev) {
        this.boltNev = boltNev;
        this.forgotoket =1000000;
    }

    public Bolt(String boltNev, int forgotoket) {
        this.boltNev = boltNev;
        this.forgotoket = forgotoket;
    }

    public String getBoltNev() {
        return boltNev;
    }

    public void setBoltNev(String boltNev) {
        this.boltNev = boltNev;
    }

    public int getForgotoket() {
        return forgotoket;
    }

    public void setForgotoket(int forgotoket) {
        this.forgotoket = forgotoket;
    }
}
