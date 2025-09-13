package oblici;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MagacinTest {

    @Test
    public void testKreiranjeMagacina() {
        Magacin m = new Magacin(900);
        assertEquals(900, m.getPovrsina());
        assertTrue(m.getKontejneri().isEmpty());
    }

    @Test
    public void testDodavanjeKontejnera() {
        Magacin m = new Magacin(900);
        Kutija k = new Kutija(5, 10, 15);
        Bure b = new Bure(5, 10);
        m.dodajKontejner(k).dodajKontejner(b);

        assertEquals(2, m.getKontejneri().size());
        assertEquals(k, m.getKontejneri().get(0));
        assertEquals(b, m.getKontejneri().get(1));
    }

    @Test
    public void testDodavanjeKontejneraPrekoracenje() {
        Magacin m = new Magacin(900);
        Kutija k = new Kutija(5, 10, 15);
        Bure b = new Bure(55, 55);

        m.dodajKontejner(k);
        assertThrows(IllegalStateException.class, () -> {
            m.dodajKontejner(b);
        });
    }
}
