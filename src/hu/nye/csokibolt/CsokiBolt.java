package hu.nye.csokibolt;

public class CsokiBolt extends Bolt{

    private static final int MENNYISEG=10;
    private int darab;
    private Csokolade[] csokik = new Csokolade[MENNYISEG];

    public CsokiBolt(String boltNev, int forgotoket, int darab, Csokolade[] csokik) {
        super(boltNev, forgotoket);
        this.darab = darab;
        this.csokik = csokik;
    }

    public CsokiBolt(String boltNev, int darab, Csokolade[] csokik) {
        super(boltNev);
        this.darab = darab;
        this.csokik = csokik;
    }

    public CsokiBolt(String boltNev, int forgotoket) {
        super(boltNev, forgotoket);
        this.darab = 0;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    public Csokolade[] getCsokik() {
        return csokik;
    }

    public void setCsokik(Csokolade[] csokik) {
        this.csokik = csokik;
    }
}
