package banka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class BankaTest {
    @BeforeEach
    public void setUp() throws Exception {
        Field brojRacuna = Racun.class.getDeclaredField("BROJ_RACUNA");
        brojRacuna.setAccessible(true);
        brojRacuna.setInt(null, 0);
        brojRacuna.setAccessible(false);
    }

    @Test
    public void testDodajKlijenta()
    {
        Banka<String> b = new Banka<>("TestBanka");
        Klijent k = new Klijent("Marko", "Markic");
        k.dodajRacun(new Racun<>("Racun1"));
        b.dodajKlijenta(k);

        assertEquals(1, b.getKlijenti().size());
        assertSame(k, b.getKlijenti().getFirst());
    }

    @Test
    public void testToString() {
        Banka<Object> b = new Banka<>("TestBanka");
        Klijent k = new Klijent("Iva", "Ivic");
        k.dodajRacun(new Racun<>(100));
        b.dodajKlijenta(k);
        String expected = "Banka: TestBanka\n" +
                          "Klijenti:\n" +
                          "Klijent: Iva Ivic\n" +
                          "--- Racuni:\n" +
                          "    1. 100\n";
        assertEquals(expected, b.toString());
    }
}
