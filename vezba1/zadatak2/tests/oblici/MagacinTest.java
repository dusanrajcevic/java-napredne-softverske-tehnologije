package oblici;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MagacinTest {
    private Magacin magacin;
    private Kutija kutija;
    private Bure bure;

    @BeforeEach
    public void setUp() {
        magacin = new Magacin(900);
        kutija = new Kutija(5, 10, 15);
        bure = new Bure(5, 10);
    }

    @Test
    public void testKreiranjeMagacina() {
        assertEquals(900, magacin.getPovrsina());
        assertTrue(magacin.getKontejneri().isEmpty());
    }

    @Test
    public void testDodavanjeKontejnera() {
        magacin.dodajKontejner(kutija).dodajKontejner(bure);

        assertEquals(2, magacin.getKontejneri().size());
        assertEquals(kutija, magacin.getKontejneri().get(0));
        assertEquals(bure, magacin.getKontejneri().get(1));
    }

    @Test
    public void testDodavanjeKontejneraPrekoracenje() {
        magacin.dodajKontejner(kutija).dodajKontejner(bure);

        assertThrows(IllegalStateException.class, () -> magacin.dodajKontejner(new Bure(55, 55)));
    }

    @Test
    public void testUklanjanjeKontejnera() throws IllegalStateException {
        int id = kutija.getId();

        magacin.dodajKontejner(kutija).dodajKontejner(bure);

        assertEquals(2, magacin.getKontejneri().size());
        assertTrue(magacin.getKontejneri().contains(kutija));
        assertTrue(magacin.getKontejneri().contains(bure));

        magacin.ukloniKontejner(id);

        assertEquals(1, magacin.getKontejneri().size());
        assertFalse(magacin.getKontejneri().contains(kutija));
        assertTrue(magacin.getKontejneri().contains(bure));
    }

    @Test
    public void testUklanjanjeKontejneraNepostojeciId() {
        int id = kutija.getId() + bure.getId();

        magacin.dodajKontejner(kutija).dodajKontejner(bure);

        assertEquals(2, magacin.getKontejneri().size());
        assertTrue(magacin.getKontejneri().contains(kutija));
        assertTrue(magacin.getKontejneri().contains(bure));

        assertThrows(IllegalArgumentException.class, () -> magacin.ukloniKontejner(id));

        assertTrue(magacin.getKontejneri().contains(kutija));
        assertTrue(magacin.getKontejneri().contains(bure));
    }

    @Test
    public void testSortiranjeKontejneraPoPovrsiniNerastuce() {
        Kutija kutija2 = new Kutija(2, 3, 4);
        Bure bure2 = new Bure(3, 7);
        magacin.dodajKontejner(kutija).dodajKontejner(bure).dodajKontejner(kutija2).dodajKontejner(bure2);

        magacin.sortirajKontejnerePoPovrsiniNerastuce();

        assertEquals(kutija2, magacin.getKontejneri().get(0));
        assertEquals(bure2, magacin.getKontejneri().get(1));
        assertEquals(bure, magacin.getKontejneri().get(2));
        assertEquals(kutija, magacin.getKontejneri().get(3));
    }

    @Test
    public void testToStringFormat() {
        magacin.dodajKontejner(kutija).dodajKontejner(bure);

        String expected = "Magacin, P = 900.0\n" +
                          kutija + "\n" +
                          bure + "\n";
        assertEquals(expected, magacin.toString());
    }
}
