package NeptunPro;

import java.util.Objects;

public abstract class Ember {
    private String nev;
    private int szev;

    public Ember(){
        this.nev="Ádám";
        this.szev=1978;
    }

    public Ember(String nev, int szev) {
        this.nev = nev;
        this.szev = szev;
    }

    public String getNev(){
        return this.nev.toUpperCase();
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzev() {
        return szev;
    }

    public void setSzev(int szev) {
        this.szev = szev;
    }

    @Override
    public String toString() {
        return  "nev='" + nev + '\n' +
                "szev=" + szev +
                '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ember ember)) return false;
        return getSzev() == ember.getSzev() && Objects.equals(getNev(), ember.getNev());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNev(), getSzev());
    }

    /*
    public static void main(String[] args) {
        Ember adam = new Ember();

        adam.nev = "Ádám";
        adam.szev = 1978;
    }

 */
}
