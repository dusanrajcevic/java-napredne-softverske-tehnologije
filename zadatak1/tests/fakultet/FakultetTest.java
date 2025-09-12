package fakultet;

import osoba.Osoba;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FakultetTest {

    @Test
    public void testKreiranjeFakulteta() {
        Osoba dekan = new Osoba("Sima Simic", "M", "0101196523456");
        Fakultet f = new Fakultet("Filoloski fakultet", dekan);
        assertEquals("Filoloski fakultet", f.getNaziv());
        assertEquals(dekan, f.getDekan());
        assertTrue(f.getStudenti().isEmpty());
    }
}
