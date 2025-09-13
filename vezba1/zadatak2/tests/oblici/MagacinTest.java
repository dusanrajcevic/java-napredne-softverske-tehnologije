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

    @Test
    public void testUklanjanjeKontejnera() {
        Magacin m = new Magacin(900);
        Kutija k = new Kutija(5, 10, 15);
        Bure b = new Bure(5, 10);
        int id = k.getId();

        m.dodajKontejner(b).dodajKontejner(k);

        assertEquals(2, m.getKontejneri().size());
        assertTrue(m.getKontejneri().contains(k));

        m.ukloniKontejner(id);

        assertEquals(1, m.getKontejneri().size());
        assertEquals(b, m.getKontejneri().getFirst());
    }

    @Test
    public void testUklanjanjeKontejneraNepostojeciId() {
        Magacin m = new Magacin(900);
        Kutija k = new Kutija(5, 10, 15);
        Bure b = new Bure(5, 10);
        int id = k.getId() + b.getId();

        m.dodajKontejner(b).dodajKontejner(k);

        assertEquals(2, m.getKontejneri().size());
        assertTrue(m.getKontejneri().contains(k));

        assertThrows(IllegalArgumentException.class, () -> {
            m.ukloniKontejner(id);
        });
    }
}
