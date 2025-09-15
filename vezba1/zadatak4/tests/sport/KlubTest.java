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
}

