package biblioteka;

import knjiga.Knjiga;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BibliotekaTest {
    @Test
    public void testKreiranjeBiblioteke() {
        assertDoesNotThrow(() -> {
            new Biblioteka("Narodna biblioteka");
        });
    }

    @Test
    public void testDodavanjeKnjige() {
        assertDoesNotThrow(() -> {
            Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
            Knjiga knjiga1 = new Knjiga("Naslov knjige", "Autor knjige", 2020);
            Knjiga knjiga2 = new Knjiga("Naslov knjige 2", "Autor knjige 2", 2022);
            biblioteka.dodajKnjigu(knjiga1).dodajKnjigu(knjiga2);
        });
    }
}
