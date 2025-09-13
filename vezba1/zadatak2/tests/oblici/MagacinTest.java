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

    @Test
    public void testSortiranjeKontejneraPoPovrsiniNerastuce() {
        Magacin m = new Magacin(900);
        Kutija k1 = new Kutija(5, 10, 15);
        Bure b1 = new Bure(5, 10);
        Kutija k2 = new Kutija(2, 3, 4);
        Bure b2 = new Bure(3, 7);
        m.dodajKontejner(k1).dodajKontejner(b1).dodajKontejner(k2).dodajKontejner(b2);

        m.sortirajKontejnerePoPovrsiniNerastuce();

        assertEquals(k2, m.getKontejneri().get(0));
        assertEquals(b2, m.getKontejneri().get(1));
        assertEquals(b1, m.getKontejneri().get(2));
        assertEquals(k1, m.getKontejneri().get(3));
    }

    @Test
    public void testToStringFormat() {
        Magacin m = new Magacin(900);
        Kutija k = new Kutija(5, 10, 15);
        Bure b = new Bure(5, 10);
        m.dodajKontejner(k).dodajKontejner(b);

        String expected = "Magacin, P = 900.0\n" +
                          k + "\n" +
                          b + "\n";
        assertEquals(expected, m.toString());
    }
}
