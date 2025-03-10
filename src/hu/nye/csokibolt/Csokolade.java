package hu.nye.csokibolt;

import java.util.Objects;

public class Csokolade extends Edesseg implements CsokoladeInterface{
    private CsokiTipus tipus;
    private String toltelek;
    private int darab;

    public Csokolade(String nev, int suly, int ar, CsokiTipus tipus, String toltelek, int darab) {
        super(nev, suly, ar);
        this.tipus = tipus;
        this.toltelek = toltelek;
        this.darab = darab;
    }

    public Csokolade(String nev, int suly, int ar, String tipus, String toltelek, int darab) {
        super(nev, suly, ar);
        this.toltelek = toltelek;
        this.darab = darab;
        switch (tipus){
            case "ét" -> { this.tipus=CsokiTipus.ÉT; break; }
            case "tej" -> { this.tipus=CsokiTipus.TEJ; break; }
            case "fehér" -> { this.tipus=CsokiTipus.FEHÉR; break; }
            default -> { this.tipus=CsokiTipus.TEJ; }
        }
    }

    public CsokiTipus getTipus() {
        return tipus;
    }

    public void setTipus(CsokiTipus tipus) {
        this.tipus = tipus;
    }

    public String getToltelek() {
        return toltelek;
    }

    public void setToltelek(String toltelek) {
        this.toltelek = toltelek;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Csokolade csokolade)) return false;
        return getNev().equals(csokolade.getNev()) &&
                getSuly() == csokolade.getSuly() &&
                getTipus() == csokolade.getTipus() &&
                Objects.equals(getToltelek(), csokolade.getToltelek());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipus(), getToltelek(), getDarab());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Név: " + this.getNev() + "\n");
        sb.append("Súly: " + this.getSuly() + "\n");
        sb.append("Ár: " + this.getAr() + "\n");
        sb.append("Tipus: " + this.getTipus() + "\n");
        sb.append("Töltelék: " + this.getToltelek() + "\n");
        sb.append("Darab: " + this.getDarab() + "\n");
        sb.append("Összkalória: " + "" + "\n");

        return sb.toString();
    }

    @Override
    public void aremeles(int ennyivel) {
        this.setAr(this.getAr()+ennyivel);
    }

    @Override
    public int akcio(int szazalek) { //szazalek = 20
        return (int) Math.round(this.getAr() * (1-(szazalek/100.0)));
    }

    @Override
    public int osszKaloria() {
        return (int) (this.getTipus().getKaloria() * (this.getSuly()/100.0));
    }
}
