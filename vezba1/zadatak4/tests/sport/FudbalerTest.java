package sport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FudbalerTest {
    @Test
    public void testKreiranjeFudbalera() {
        Fudbaler f = new Fudbaler("Petar Petrovic", 22, Pozicija.NAPADAC);
        assertEquals("Petar Petrovic", f.getImePrezime());
        assertEquals(22, f.getGodine());
        assertEquals("napadac", f.getPozicija().toString());
    }

    @Test
    public void testToStringFormat() {
        Fudbaler f = new Fudbaler("Petar Petrovic", 22, Pozicija.NAPADAC);
        String expected = f.getId() + ". Petar Petrovic (22) - napadac";
        assertEquals(expected, f.toString());
    }
}