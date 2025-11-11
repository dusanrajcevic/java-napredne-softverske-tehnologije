package banka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinansijskaBankaTest {
    @Test
    public void testUkupno() {
        FinansijskaBanka<Double> fb = new FinansijskaBanka<>("FB");
        Klijent k1 = new Klijent("S", "S");
        k1.dodajRacun(new Racun<>(100.0));
        k1.dodajRacun(new Racun<>(50));
        fb.dodajKlijenta(k1);

        double ukupno = fb.ukupno();
        assertEquals(150.0, ukupno, 0.001);
    }

    @Test
    public void testToString() {
        FinansijskaBanka<Double> fb = new FinansijskaBanka<>("FB2");
        Klijent k = new Klijent("T", "T");
        k.dodajRacun(new Racun<>(10.5));
        fb.dodajKlijenta(k);

        String expected = "Finansijska banka (ukupno=10.5)\n" +
                          "Banka: FB2\n" +
                          "Klijenti:\n" +
                          "Klijent: T T\n" +
                          "--- Racuni:\n" +
                          "    1. 10.5\n";
        assertEquals(expected, fb.toString());
    }
}
