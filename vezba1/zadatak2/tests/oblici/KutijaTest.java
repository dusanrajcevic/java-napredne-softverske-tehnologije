package oblici;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KutijaTest {
    private Kutija kutija;

    @BeforeEach
    public void setUp() {
        kutija = new Kutija(10, 20, 30);
    }

    @Test
    public void testKreiranjeKutije() {
        Kutija kutija2 = new Kutija(20, 30, 40);
        assertTrue(kutija.getId() > 0);
        assertTrue(kutija2.getId() > 0);
        assertTrue(kutija.getId() != kutija2.getId());
    }

    @Test
    public void testPovrsina() {
        double expectedPovrsina = 2 * (10 * 20 + 10 * 30 + 20 * 30);
        assertTrue(Math.abs(expectedPovrsina - kutija.povrsina()) < 0.0001);
    }

    @Test
    public void testZapremina() {
        double expectedZapremina = 10 * 20 * 30;
        assertTrue(Math.abs(expectedZapremina - kutija.zapremina()) < 0.0001);
    }

    @Test
    public void testToStringFormat() {
        String expectedString = String.format("%d. Kutija P = %.2f, V = %.2f", kutija.getId(), kutija.povrsina(), kutija.zapremina());
        assertEquals(expectedString, kutija.toString());
    }

    @Test
    public void testSortiranjeBure() {
        Kutija kutija2 = new Kutija(15, 25, 35);
        Kutija kutija3 = new Kutija(5, 10, 20);
        List<Kutija> kutije = new ArrayList<>(List.of(kutija, kutija2, kutija3));
        Collections.sort(kutije);
        assertEquals(kutija3, kutije.get(0));
        assertEquals(kutija, kutije.get(1));
        assertEquals(kutija2, kutije.get(2));
    }
}
