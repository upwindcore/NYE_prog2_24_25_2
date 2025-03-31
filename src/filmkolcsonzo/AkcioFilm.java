package filmkolcsonzo;

public class AkcioFilm extends Film implements AkcioFilmInterface{
    private int aldozatokszama;

    public AkcioFilm(String cim, String foszereplo, int hossz, double kolcsonzesiar, int napokszama, FilmTipus tipus, int aldozatokszama) {
        super(cim, foszereplo, hossz, kolcsonzesiar, napokszama, tipus);
        this.aldozatokszama = aldozatokszama;
    }

    public int getAldozatokszama() {
        return aldozatokszama;
    }

    public void setAldozatokszama(int aldozatokszama) {
        this.aldozatokszama = aldozatokszama;
    }

    @Override
    public String toString() {
        return super.toString() +
                "aldozatokszama=" + aldozatokszama + "\n";
    }

    @Override
    public double otpercenkent() {
        int hanyados = this.getHossz() / 5;
        if (this.getHossz() % 5 != 0) {
            hanyados++;
        }
        return this.getAldozatokszama() / (double)hanyados;
    }

    @Override
    public int besorolas() {
        double aldozatok = this.otpercenkent()
        if (aldozatok < 1) {
            return 8;
        } else if (aldozatok < 5) {
            return 12;
        } else if (aldozatok < 10) {
            return 16;
        }
        return 18;
    }
}
