package prevoz;

import org.junit.jupiter.api.Test;
import tovar.Prtljag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TeretnoVoziloTest {

    @Test
    public void testKreiranjeTeretnogVozila() {
        TeretnoVozilo tv = new TeretnoVozilo(5000, "Volvo");
        assertEquals(5000, tv.getMaxTezina());
        assertEquals("Volvo", tv.getMarka());
    }

    @Test
    public void testDodavanjePrtljaga() {
        TeretnoVozilo tv = new TeretnoVozilo(200, "Volvo");
        Prtljag p1 = new Prtljag("Dzak", 50);
        Prtljag p2 = new Prtljag("Torba", 150);
        Prtljag p3 = new Prtljag("Kesa", 1);

        tv.dodajPrtljag(p1).dodajPrtljag(p2);
        assertEquals(200, tv.ukupnaTezinaPrtljaga());
        assertThrows(IllegalArgumentException.class, () -> tv.dodajPrtljag(p3));
    }

    @Test
    public void testIstovarPrtljaga() {
        TeretnoVozilo tv = new TeretnoVozilo(200, "Volvo");
        Prtljag p1 = new Prtljag("Dzak", 50);
        Prtljag p2 = new Prtljag("Torba", 150);

        tv.dodajPrtljag(p1).dodajPrtljag(p2);
        assertEquals(200, tv.ukupnaTezinaPrtljaga());

        Prtljag istovareni = tv.istovariPrtljag(p1.getId());
        assertEquals(p1, istovareni);
        assertEquals(150, tv.ukupnaTezinaPrtljaga());

        assertThrows(IllegalArgumentException.class, () -> tv.istovariPrtljag(999));
    }

    @Test
    public void testToString() {
        TeretnoVozilo tv = new TeretnoVozilo(3000, "Scania");
        Prtljag p1 = new Prtljag("Torba", 20);
        Prtljag p2 = new Prtljag("Kofer", 30);
        Prtljag p3 = new Prtljag("Ranac", 10);
        tv.dodajPrtljag(p1).dodajPrtljag(p2).dodajPrtljag(p3);
        String expected = "Scania [3000]\n  "
                + "Prtljag:\n    "
                + p1 + "\n    "
                + p2 + "\n    "
                + p3 + "\n  "
                + "Ukupno: 60.00";
        assertEquals(expected, tv.toString());
    }
}
