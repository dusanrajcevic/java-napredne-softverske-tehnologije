package oblici;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KutijaTest {

    @Test
    public void testKreiranjeKutije() {
        Kutija k1 = new Kutija(10, 20, 30);
        Kutija k2 = new Kutija(20, 30, 40);
        assertTrue(k1.getId() > 0);
        assertTrue(k2.getId() > 0);
        assertTrue(k1.getId() != k2.getId());
    }

    @Test
    public void testPovrsina() {
        Kutija k = new Kutija(10, 20, 30);
        double expectedPovrsina = 2 * (10 * 20 + 10 * 30 + 20 * 30);
        assertTrue(Math.abs(expectedPovrsina - k.povrsina()) < 0.0001);
    }

    @Test
    public void testZapremina() {
        Kutija k = new Kutija(10, 20, 30);
        double expectedZapremina = 10 * 20 * 30;
        assertTrue(Math.abs(expectedZapremina - k.zapremina()) < 0.0001);
    }

    @Test
    public void testToStringFormat() {
        Kutija k = new Kutija(10, 20, 30);
        String expectedString = String.format("%d. Kutija P = %.2f, V = %.2f", k.getId(), k.povrsina(), k.zapremina());
        assertEquals(expectedString, k.toString());
    }
}
