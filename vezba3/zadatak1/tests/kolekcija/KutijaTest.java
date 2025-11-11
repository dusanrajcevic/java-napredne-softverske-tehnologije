package kolekcija;

import artikli.Telefon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KutijaTest {
    @BeforeEach
    public void setUp() throws Exception {
        Field id = Kutija.class.getDeclaredField("ID");
        id.setAccessible(true);
        id.setInt(null, 0);
        id.setAccessible(false);
    }

    @Test
    public void testToString() {
        Kutija<String> kutija = new Kutija<>("Test Sadrzaj");
        String expected = "1. Test Sadrzaj";
        assertEquals(expected, kutija.toString());
    }

    @Test
    public void testGetSadrzaj() {
        Kutija<Integer> kutija = new Kutija<>(42);
        Integer expected = 42;
        assertEquals(expected, kutija.getSadrzaj());
    }

    @Test
    public void testGetSadrzajTelefon()
    {
        Telefon telefon = new Telefon("Samsung Galaxy S21", 799.99);
        Kutija<Telefon> kutija = new Kutija<>(telefon);
        assertEquals(telefon, kutija.getSadrzaj());
    }

    @Test
    public void testGetSadrzajKnjiga()
    {
        artikli.Knjiga knjiga = new artikli.Knjiga("The Great Gatsby", "F. Scott Fitzgerald");
        Kutija<artikli.Knjiga> kutija = new Kutija<>(knjiga);
        assertEquals(knjiga, kutija.getSadrzaj());
    }
}
