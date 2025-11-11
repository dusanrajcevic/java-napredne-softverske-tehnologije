package banka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KlijentTest {
    @Test
    public void testDodajRacun() {
        Klijent k = new Klijent("Marko", "Markovic");
        assertEquals(0, k.getRacuni().size());

        k.dodajRacun(new Racun<>(10));
        k.dodajRacun(new Racun<>(20.5));

        assertEquals(2, k.getRacuni().size());
    }

    @Test
    public void testToString() {
        Klijent k = new Klijent("Milan", "Milic");
        k.dodajRacun(new Racun<>(5));
        k.dodajRacun(new Racun<>(15.75));
        String expected = "Klijent: Milan Milic\n" +
                          "--- Racuni:\n" +
                          "    1. 5\n" +
                          "    2. 15.75\n";
        assertEquals(expected, k.toString());
    }
}
