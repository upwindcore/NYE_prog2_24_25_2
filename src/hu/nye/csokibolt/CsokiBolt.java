package hu.nye.csokibolt;

import java.util.Arrays;

public class CsokiBolt extends Bolt implements CsokiBoltInterface{

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

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Név: " + this.getBoltNev());
        sb.append("Forgótőke: " + this.getForgotoket() + "\n");
        sb.append("Árukészlet: \n");

        for (Csokolade csoki: csokik) {
            try {
                sb.append(csoki.toString());
            } catch (NullPointerException ex) {
                sb.append("Nincs a raktárban a tárolóban csoki.\n");
            }
        }
        //Arrays.toString(csokik);

        return sb.toString();
    }

    @Override
    public void vesz(Csokolade ezt) {
        Csokolade megtalalt = this.keres(ezt);
        if (!vanElegPenzem(ezt)) {
            System.out.println("Nincs elég pénzem a vásárláshoz!");
            return;
        }

        if (megtalalt == null && darab == CsokiBolt.MENNYISEG) {
            System.out.println("Nincs elég hely a raktárban");
            return;
        }

        if (megtalalt != null) {
            megtalalt.setDarab(megtalalt.getDarab() + ezt.getDarab());
        } else {
            csokik[darab] = ezt;
            darab++;
        }
        decForgotoke(ezt);
        System.out.printf("Sikeres vásárlás");
        System.out.println("A forgotoke összege: " + getForgotoket());

    }

    public boolean vanElegPenzem(Csokolade ezt) {
        return getForgotoket() - (ezt.getDarab() * ezt.getAr()) >= 0;
    }

    public void decForgotoke(Csokolade ezt) {
        this.setForgotoket(this.getForgotoket() - (ezt.getDarab() * ezt.getAr()));
    }

    public void incForgotoke(Csokolade ezt, int ar) {
        this.setForgotoket(this.getForgotoket() + (ezt.getDarab() * ar));
    }

    @Override
    public boolean elad(Csokolade ezt) {
        if (darab == 0) {
            System.out.println("A raktár üres");
            return false;
        }

        Csokolade megtalalt = keres(ezt);
        if (megtalalt == null) {
            System.out.println("A csoki nincs a raktárban!");
            return false;
        }

        if (megtalalt.getDarab() >= ezt.getDarab()) {
            megtalalt.setDarab(megtalalt.getDarab() - ezt.getDarab());
            incForgotoke(ezt, megtalalt.getAr());
            if (megtalalt.getDarab() == 0) {
                for (int i=0; i<darab; i++) {
                    if (megtalalt.equals(csokik[i])) {
                        csokik[i] = null;
                        break;
                    }
                }
                darab--;
                Arrays.sort(csokik);
            }
        } else {
            System.out.println("Nincs elég eladható csoki!");
            return false;
        }
        return true;
    }

    @Override
    public Csokolade keres(Csokolade ezt) {
        for (int i=0; i<darab; i++) {
            if (csokik[i].equals(ezt)) {
                return csokik[i];
            }
        }
        return null;
    }
}
