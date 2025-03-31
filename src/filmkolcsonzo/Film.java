package filmkolcsonzo;

public class Film implements FilmInterface {
    private String cim;
    private String foszereplo;
    private int hossz;
    private double kolcsonzesiar;
    private int napokszama;
    private FilmTipus tipus;


    public Film(String cim, String foszereplo, int hossz, double kolcsonzesiar, int napokszama, FilmTipus tipus) {
        this.cim = cim;
        this.foszereplo = foszereplo;
        this.hossz = hossz;
        this.kolcsonzesiar = kolcsonzesiar;
        this.napokszama = napokszama;
        this.tipus = tipus;
    }


    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getFoszereplo() {
        return foszereplo;
    }

    public void setFoszereplo(String foszereplo) {
        this.foszereplo = foszereplo;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }

    public double getKolcsonzesiar() {
        return kolcsonzesiar;
    }

    public void setKolcsonzesiar(double kolcsonzesiar) {
        this.kolcsonzesiar = kolcsonzesiar;
    }

    public int getNapokszama() {
        return napokszama;
    }

    public void setNapokszama(int napokszama) {
        this.napokszama = napokszama;
    }

    public FilmTipus getTipus() {
        return tipus;
    }

    public void setTipus(FilmTipus tipus) {
        this.tipus = tipus;
    }

    public String idoAtalakito(int hossz) {
        int ora = hossz / 60;
        int perc = hossz - (ora * 60);
        return ora + ":" + perc;
    }

    @Override
    public String toString() {
        return  "cim='" + cim.toUpperCase() + '\n' +
                "foszereplo='" + foszereplo.toUpperCase() + '\n' +
                "hossz=" + idoAtalakito(hossz) + "\n" +
                "kolcsonzesiar=" + kolcsonzesiar + "HUF\n" +
                "napokszama=" + napokszama + "\n" +
                "tipus=" + tipus + "\n";
    }

    @Override
    public int hanyszor() {
        return ((24 * 60) * this.napokszama) / this.hossz;
    }

    @Override
    public int osszbevetel(boolean torzsvendeg) {
        double osszeg = (int)(this.napokszama * this.kolcsonzesiar);
        if (torzsvendeg) {
            osszeg = (int)(osszeg * 0.9);
        }
        return (int) Math.round(osszeg);
    }
}
