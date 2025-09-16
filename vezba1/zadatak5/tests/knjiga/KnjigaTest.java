package knjiga;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testKreiranjeKopijeKnjige() {
        Knjiga kopija = new Knjiga(knjiga);
        assertEquals(knjiga.getNaziv(), kopija.getNaziv());
        assertEquals(knjiga.getAutor(), kopija.getAutor());
        assertEquals(knjiga.getGodinaIzdanja(), kopija.getGodinaIzdanja());
        assertEquals(knjiga.getId(), kopija.getId());
        assertNotEquals(knjiga, kopija);
    }

    @Test
    public void testSortiranjePoGodiniIzdanjaNeopadajuce() {
        Knjiga knjiga2 = new Knjiga("Knjiga2", "Autor2", 2002);
        Knjiga knjiga3 = new Knjiga("Knjiga3", "Autor3", 2000);
        List<Knjiga> lista = new ArrayList<>(List.of(knjiga, knjiga2, knjiga3));
        Collections.sort(lista);
        assertEquals(knjiga3, lista.get(0));
        assertEquals(knjiga2, lista.get(1));
        assertEquals(knjiga, lista.get(2));
    }

    @Test
    public void testToStringFormat() {
        String expectedString = knjiga.getId() + ". Knjiga1 - Autor1 (2025)";
        assertEquals(expectedString, knjiga.toString());
    }
}
