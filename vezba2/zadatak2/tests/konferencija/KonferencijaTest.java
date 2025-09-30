package konferencija;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class KonferencijaTest {
    private Konferencija konferencija;

    @BeforeEach
    void setUp() {
        konferencija = new Konferencija("IT Trends", LocalDate.of(2025, 12, 5));
    }

    @Test
    void testPrikaziPredavanjaVracaPrazanStringBezDodavanjaPredavanja() {
        assertEquals("--- Predavanja:\n", konferencija.prikaziPredavanja());
    }

    @Test
    void testPrikaziPredavanjaFormatSaDodavanjemPredavanja() {
        konferencija.dodajPredavanje("AI", "Marko Marković", 45);
        konferencija.dodajPredavanje("Cyber", "Petar Petrović", 50);
        String expected = """
                --- Predavanja:
                    AI - Marko Marković (45 min)
                    Cyber - Petar Petrović (50 min)
                """;
        assertEquals(expected, konferencija.prikaziPredavanja());
    }
}
