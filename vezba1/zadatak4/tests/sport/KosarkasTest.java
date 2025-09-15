package sport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KosarkasTest {
    @Test
    public void testKreiranjeKosarkasa() {
        Kosarkas k = new Kosarkas("Jovan Jovanovic", 27, 198);
        assertEquals("Jovan Jovanovic", k.getImePrezime());
        assertEquals(27, k.getGodine());
        assertEquals(198, k.getVisina());
    }

    @Test
    public void testToStringFormat() {
        Kosarkas k = new Kosarkas("Jovan Jovanovic", 27, 198);
        String expected = k.getId() + ". Jovan Jovanovic (27) - 198cm";
        assertEquals(expected, k.toString());
    }
}

