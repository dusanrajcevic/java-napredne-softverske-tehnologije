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

    @Test
    public void testUpisStudenta() {
        Osoba dekan = new Osoba("Sima Simic", "M", "0101196523456");
        Fakultet f = new Fakultet("Filoloski fakultet", dekan);
        Student s = new Student("Petar Petrovic", "M", "0101995123456", "04-15/2025", 9.5);
        f.upisiStudenta(s);
        assertEquals(1, f.getStudenti().size());
        assertEquals(s, f.getStudenti().getFirst());
    }
}
