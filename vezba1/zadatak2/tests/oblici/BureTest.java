package oblici;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BureTest {

    @Test
    public void testKreiranjeBure() {
        Bure b1 = new Bure(10, 20);
        Bure b2 = new Bure(15, 25);
        assertTrue(b1.getId() > 0);
        assertTrue(b2.getId() > 0);
        assertTrue(b1.getId() != b2.getId());
    }

    @Test
    public void testPovrsina() {
        Bure b = new Bure(10, 20);
        double expectedPovrsina = 2 * Math.pow(5, 2) * Math.PI + 2 * 5 * Math.PI * 20;
        assertTrue(Math.abs(expectedPovrsina - b.povrsina()) < 0.0001);
    }

    @Test
    public void testZapremina() {
        Bure b = new Bure(10, 20);
        double expectedZapremina = Math.pow(5, 2) * Math.PI * 20;
        assertTrue(Math.abs(expectedZapremina - b.zapremina()) < 0.0001);
    }

    @Test
    public void testToStringFormat() {
        Bure b = new Bure(10, 20);
        String expectedString = String.format("%d. Bure P = %.2f, V = %.2f", b.getId(), b.povrsina(), b.zapremina());
        assertEquals(expectedString, b.toString());
    }
}
