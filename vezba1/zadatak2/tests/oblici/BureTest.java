package oblici;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BureTest {
    private Bure bure;

    @BeforeEach
    public void setUp() {
        bure = new Bure(10, 20);
    }

    @Test
    public void testKreiranjeBure() {
        Bure bure2 = new Bure(15, 25);
        assertTrue(bure.getId() > 0);
        assertTrue(bure2.getId() > 0);
        assertTrue(bure.getId() != bure2.getId());
    }

    @Test
    public void testPovrsina() {
        double expectedPovrsina = 2 * Math.pow(5, 2) * Math.PI + 2 * 5 * Math.PI * 20;
        assertTrue(Math.abs(expectedPovrsina - bure.povrsina()) < 0.0001);
    }

    @Test
    public void testZapremina() {
        double expectedZapremina = Math.pow(5, 2) * Math.PI * 20;
        assertTrue(Math.abs(expectedZapremina - bure.zapremina()) < 0.0001);
    }

    @Test
    public void testToStringFormat() {
        String expectedString = String.format("%d. Bure P = %.2f, V = %.2f", bure.getId(), bure.povrsina(), bure.zapremina());
        assertEquals(expectedString, bure.toString());
    }

    @Test
    public void testSortiranjeBure() {
        Bure bure2 = new Bure(15, 25);
        Bure bure3 = new Bure(5, 30);
        List<Bure> bureList = new ArrayList<>(List.of(bure, bure2, bure3));
        Collections.sort(bureList);
        assertEquals(bure3, bureList.get(0));
        assertEquals(bure, bureList.get(1));
        assertEquals(bure2, bureList.get(2));
    }
}
