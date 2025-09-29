package festival;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FestivalTest {
    private Festival festival;

    @BeforeEach
    void setUp() {
        festival = new Festival("Exit", LocalDate.of(2025, 12, 31));
    }

    @Test
    void testPrikaziNastupeVracaPrazanStringBezDodavanjaNastupa() {
        assertEquals("", festival.prikaziNastupe());
    }

    @Test
    void testPrikaziNastupeFormatSaDodavanjemNastupa() {
        festival.dodajNastup("Parni Valjak", 90)
                .dodajNastup("Dubioza Kolektiv", 75);
        String expected = "--- Nastupi:\n" +
                "    Parni Valjak (90 min)\n" +
                "    Dubioza Kolektiv (75 min)\n";
        assertEquals(expected, festival.prikaziNastupe());
    }

    @Test
    void testSortirajNastupePoTrajanjuNerastuce() {
        festival.dodajNastup("Parni Valjak", 90)
                .dodajNastup("Dubioza Kolektiv", 75)
                .dodajNastup("Riblja Corba", 80)
                .sortirajNastupePoTrajanju();

        String expected = "--- Nastupi:\n" +
                "    Dubioza Kolektiv (75 min)\n" +
                "    Riblja Corba (80 min)\n" +
                "    Parni Valjak (90 min)\n";
        assertEquals(expected, festival.prikaziNastupe());
    }

    @Test
    void testPrikaziRasporedVracaPrazanStringBezDodavanjaNastupa() {
        assertEquals("", festival.prikaziRaspored(20, 0, 10));
    }

    @Test
    void testPrikaziRasporedFormatSaDodavanjemNastupa() {
        festival.dodajNastup("Parni Valjak", 90)
                .dodajNastup("Dubioza Kolektiv", 75)
                .dodajNastup("Riblja Corba", 80);

        String expected = "--- Raspored (31.12.2025):\n" +
                "    20:00 - Parni Valjak (90 min)\n" +
                "    21:40 - Dubioza Kolektiv (75 min)\n" +
                "    23:05 - Riblja Corba (80 min)\n";
        assertEquals(expected, festival.prikaziRaspored(20, 0, 10));
    }
}
