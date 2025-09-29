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
        String expected = """
                --- Nastupi:
                    Parni Valjak (90 min)
                    Dubioza Kolektiv (75 min)
                """;
        assertEquals(expected, festival.prikaziNastupe());
    }

    @Test
    void testSortirajNastupePoTrajanjuNerastuce() {
        festival.dodajNastup("Parni Valjak", 90)
                .dodajNastup("Dubioza Kolektiv", 75)
                .dodajNastup("Riblja Corba", 80)
                .sortirajNastupePoTrajanju();

        String expected = """
                --- Nastupi:
                    Dubioza Kolektiv (75 min)
                    Riblja Corba (80 min)
                    Parni Valjak (90 min)
                """;
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

        String expected = """
                --- Raspored (31.12.2025):
                    20:00 - Parni Valjak (90 min)
                    21:40 - Dubioza Kolektiv (75 min)
                    23:05 - Riblja Corba (80 min)
                """;
        assertEquals(expected, festival.prikaziRaspored(20, 0, 10));
    }

    @Test
    void testToStringFormat() {
        festival.dodajNastup("Parni Valjak", 90)
                .dodajNastup("Dubioza Kolektiv", 75);

        String expected = """
                Festival: Exit (2025)
                --- Nastupi:
                    Dubioza Kolektiv (75 min)
                    Parni Valjak (90 min)
                """;
        assertEquals(expected, festival.toString());
    }
}
