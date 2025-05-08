package edu.nye.pl2.komp.jarmu;

public abstract class Jarmu {
    private final String rendszam;

    protected Jarmu(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getRendszam() {
        return rendszam;
    }

    @Override public String toString() {
        return "Jarmu{" +
                "rendszam='" + rendszam + '\'' +
                '}';
    }
}
