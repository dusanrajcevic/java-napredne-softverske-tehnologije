package oblici;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @Test
    public void testSortiranjeBure() {
        Kutija k1 = new Kutija(10, 20, 30);
        Kutija k2 = new Kutija(15, 25, 35);
        Kutija k3 = new Kutija(5, 10, 20);
        List<Kutija> kutije = new ArrayList<>(List.of(k1, k2, k3));
        Collections.sort(kutije);
        assertEquals(k3, kutije.get(0));
        assertEquals(k1, kutije.get(1));
        assertEquals(k2, kutije.get(2));
    }
}
