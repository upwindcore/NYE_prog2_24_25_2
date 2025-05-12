package konyvtar;

public interface Gyujtemeny<T extends Dokumentum> {

    void felvesz(T dokumentum);

    double atlagAr();

    T[] dokumentumok();

}
