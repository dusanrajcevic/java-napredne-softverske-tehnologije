package sport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FudbalerTest {
    @Test
    public void testKreiranjeFudbalera() {
        Fudbaler f = new Fudbaler("Petar Petrovic", 22, "napadac");
        assertEquals("Petar Petrovic", f.getImePrezime());
        assertEquals(22, f.getGodine());
        assertEquals("napadac", f.getPozicija());
    }

    @Test
    public void testToStringFormat() {
        Fudbaler f = new Fudbaler("Petar Petrovic", 22, "napadac");
        String expected = f.getId() + ". Petar Petrovic (22) - napadac";
        assertEquals(expected, f.toString());
    }
}

