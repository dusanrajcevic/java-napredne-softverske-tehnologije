package knjiga;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnjigaTest {
    private Knjiga knjiga;

    @BeforeEach
    public void setUp() {
        knjiga = new Knjiga("Knjiga1", "Autor1", 2025);
    }

    @Test
    public void testKreiranjeKnjige() {
        for(int i = 0; i < 100; i++) {
            String naziv = "Knjiga" + i;
            String autor = "Autor" + i;
            int godinaIzdanja = 2000 + i;
            Knjiga k = new Knjiga(naziv, autor, godinaIzdanja);
            assertEquals(naziv, k.getNaziv());
            assertEquals(autor, k.getAutor());
            assertEquals(godinaIzdanja, k.getGodinaIzdanja());
            assertTrue(k.getId() > 0);
        }
    }
}
