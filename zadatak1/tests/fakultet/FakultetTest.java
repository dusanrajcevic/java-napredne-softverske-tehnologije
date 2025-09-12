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

    @Test
    public void testIspisPostojecegStudenta() {
        Osoba dekan = new Osoba("Sima Simic", "M", "0101196523456");
        Fakultet f = new Fakultet("Filoloski fakultet", dekan);
        Student s1 = new Student("Petar Petrovic", "M", "0101995123456", "04-15/2025", 9.5);
        Student s2 = new Student("Ivan Ivanovic", "M", "0201998123456", "04-15/2023", 9.3);
        f.upisiStudenta(s1);
        f.upisiStudenta(s2);

        assertTrue(f.ispisiStudenta("04-15/2023"));
        assertEquals(1, f.getStudenti().size());
        assertEquals("04-15/2025", f.getStudenti().getFirst().getBrojIndeksa());
    }

    @Test
    public void testIspisNepostojecegStudenta() {
        Osoba dekan = new Osoba("Sima Simic", "M", "0101196523456");
        Fakultet f = new Fakultet("Filoloski fakultet", dekan);
        Student s1 = new Student("Petar Petrovic", "M", "0101995123456", "04-15/2025", 9.5);
        Student s2 = new Student("Ivan Ivanovic", "M", "0201998123456", "04-15/2023", 9.3);
        f.upisiStudenta(s1);
        f.upisiStudenta(s2);

        assertFalse(f.ispisiStudenta("xx"));
        assertEquals(2, f.getStudenti().size());
        assertEquals("04-15/2025", f.getStudenti().getFirst().getBrojIndeksa());
    }

    @Test
    public void testToStringFormat() {
        Osoba dekan = new Osoba("Sima Simic", "M", "0101196523456");
        Fakultet f = new Fakultet("Filoloski fakultet", dekan);
        Student s1 = new Student("Petar Petrovic", "M", "0101995123456", "04-15/2025", 9.5);
        Student s2 = new Student("Ivan Ivanovic", "M", "0201998123456", "04-15/2023", 9.3);
        Student s3 = new Student("Marija Marijanovic", "Z", "0301997123456", "04-15/2021", 9.4);
        f.upisiStudenta(s1);
        f.upisiStudenta(s2);
        f.upisiStudenta(s3);

        String output = f.toString();
        String expected = "Fakultet: Filoloski fakultet\n" +
                "- Dekan: Sima Simic (829)\n" +
                "--- Studenti:\n" +
                "------ Petar Petrovic (30) - 04-15/2025 [9.5]\n" +
                "------ Ivan Ivanovic (27) - 04-15/2023 [9.3]\n" +
                "------ Marija Marijanovic (28) - 04-15/2021 [9.4]\n";

        assertEquals(expected, output);
    }
}
