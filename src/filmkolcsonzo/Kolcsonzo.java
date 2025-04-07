package filmkolcsonzo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kolcsonzo {
    private List<Film> filmek = new ArrayList<>();

    public void setFilmek(List<Film> filmek) {
        this.filmek = filmek;
    }

    public void feltolt() {
        try (BufferedReader be = new BufferedReader(new FileReader("filmek.txt"));) {

            String sor = null;
            while ((sor=be.readLine()) != null) {
                System.out.println(sor);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Kolcsonzo
    }
}
