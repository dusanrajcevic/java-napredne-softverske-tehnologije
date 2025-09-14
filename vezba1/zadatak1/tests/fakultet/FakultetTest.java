package fakultet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import osoba.Osoba;

import static org.junit.jupiter.api.Assertions.*;

public class FakultetTest {
    private Osoba dekan;
    private Fakultet fakultet;

    @BeforeEach
    public void setUp() {
        dekan = new Osoba("Sima Simic", "M", "0101196523456");
        fakultet = new Fakultet("Filoloski fakultet", dekan);
    }

    @Test
    public void testKreiranjeFakulteta() {
        assertEquals("Filoloski fakultet", fakultet.getNaziv());
        assertEquals(dekan, fakultet.getDekan());
        assertTrue(fakultet.getStudenti().isEmpty());
    }

    @Test
    public void testUpisStudenta() {
        Student s = new Student("Petar Petrovic", "M", "0101995123456", "04-15/2025", 9.5);
        fakultet.upisiStudenta(s);
        assertEquals(1, fakultet.getStudenti().size());
        assertEquals(s, fakultet.getStudenti().getFirst());
    }

    @ParameterizedTest
    @CsvSource({
        "04-15/2023,true,1",
        "xx,false,2"
    })
    public void testIspisStudenta(String indeks, boolean ispisan, int brojStudenataNakonIspisa) {
        Student s1 = new Student("Petar Petrovic", "M", "0101995123456", "04-15/2025", 9.5);
        Student s2 = new Student("Ivan Ivanovic", "M", "0201998123456", "04-15/2023", 9.3);
        fakultet.upisiStudenta(s1).upisiStudenta(s2);

        assertEquals(ispisan, fakultet.ispisiStudenta(indeks));
        assertEquals(brojStudenataNakonIspisa, fakultet.getStudenti().size());
        assertEquals("04-15/2025", fakultet.getStudenti().getFirst().getBrojIndeksa());
    }

    @Test
    public void testToStringFormat() {
        Student s1 = new Student("Petar Petrovic", "M", "0101995123456", "04-15/2025", 9.5);
        Student s2 = new Student("Ivan Ivanovic", "M", "0201998123456", "04-15/2023", 9.3);
        Student s3 = new Student("Marija Marijanovic", "Z", "0301997123456", "04-15/2021", 9.4);
        fakultet.upisiStudenta(s1).upisiStudenta(s2).upisiStudenta(s3);

        String output = fakultet.toString();
        String expected = """
                Fakultet: Filoloski fakultet
                - Dekan: Sima Simic (829)
                --- Studenti:
                ------ Petar Petrovic (30) - 04-15/2025 [9.5]
                ------ Ivan Ivanovic (27) - 04-15/2023 [9.3]
                ------ Marija Marijanovic (28) - 04-15/2021 [9.4]
                """;

        assertEquals(expected, output);
    }
}
