package osobe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IgracTest {
    private Igrac igrac;

    @BeforeEach
    public void setUp() {
        igrac = new Igrac("Ivan Ivanovic", 25);
    }
    @Test
    public void testKreiranjeIgraca() {
        for(int i = 0; i < 100; i++) {
            String ime = "Ime " + i;
            int godine = (int) (Math.random() * 20) + 18;
            Igrac p = new Igrac(ime, godine);
            assertEquals(ime, p.getImePrezime());
            assertEquals(godine, p.getGodine());
            assertTrue(p.getId() > 0);
        }
    }

    @Test
    void testJedinstvenId() {
        Igrac igrac2 = new Igrac("Marko Markovic", 27);
        assertTrue(igrac.getId() > 0);
        assertTrue(igrac2.getId() > 0);
        assertTrue(igrac.getId() != igrac2.getId());
    }

    @Test
    public void testToStringFormat() {
        String expected = igrac.getId() + ". Ivan Ivanovic (25)";
        assertEquals(expected, igrac.toString());
    }
}