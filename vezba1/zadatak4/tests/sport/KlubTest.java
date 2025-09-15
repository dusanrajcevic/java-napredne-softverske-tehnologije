package sport;

import org.junit.jupiter.api.Test;
import osobe.Igrac;
import static org.junit.jupiter.api.Assertions.*;

public class KlubTest {
    @Test
    public void testKreiranjeKluba() {
        Klub klub = new Klub("Crvena Zvezda", "fudbal");
        assertEquals("Crvena Zvezda", klub.getNaziv());
        assertEquals("fudbal", klub.getSport());
        assertTrue(klub.getIgraci().isEmpty());
    }

    @Test
    public void testDodajIgraca() {
        Klub klub = new Klub("Partizan", "fudbal");
        Igrac igrac = new Igrac("B", 22);
        klub.dodajIgraca(igrac);
        assertEquals(1, klub.getIgraci().size());
        assertEquals(igrac, klub.getIgraci().getFirst());
    }

    @Test
    public void testUkloniIgraca() {
        Klub klub = new Klub("Test", "fudbal");
        Igrac igrac = new Igrac("A", 20);
        klub.dodajIgraca(igrac);
        klub.ukloniIgraca(igrac.getId());
        assertTrue(klub.getIgraci().isEmpty());
        assertThrows(IllegalArgumentException.class, () -> klub.ukloniIgraca(-1));
    }

    @Test
    public void testSortiranjePoGodinama() {
        Klub klub = new Klub("Test", "fudbal");
        Igrac i1 = new Igrac("A", 30);
        Igrac i2 = new Igrac("B", 20);
        klub.dodajIgraca(i1).dodajIgraca(i2);
        klub.sortirajPoGodinamaNeopadajuce();
        assertEquals(i2, klub.getIgraci().get(0));
        assertEquals(i1, klub.getIgraci().get(1));
    }

    @Test
    public void testToStringFormat() {
        Klub klub = new Klub("Crvena Zvezda", "fudbal");
        Igrac igrac = new Igrac("Marko Markovic", 25);
        klub.dodajIgraca(igrac);
        String expected = "Klub: Crvena Zvezda (fudbal)\n--- Igraci:\n----- " + igrac + "\n";
        assertEquals(expected, klub.toString());
    }
}