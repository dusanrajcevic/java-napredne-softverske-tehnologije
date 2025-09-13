package oblici;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @Test
    public void testSortiranjeBure() {
        Bure b1 = new Bure(10, 20);
        Bure b2 = new Bure(15, 25);
        Bure b3 = new Bure(5, 30);
        List<Bure> bureList = new ArrayList<>(List.of(b1, b2, b3));
        Collections.sort(bureList);
        assertEquals(b3, bureList.get(0));
        assertEquals(b1, bureList.get(1));
        assertEquals(b2, bureList.get(2));
    }
}
