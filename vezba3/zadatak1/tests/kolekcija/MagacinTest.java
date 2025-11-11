package kolekcija;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagacinTest {
    @Test
    public void testDodajKutiju() {
        Magacin<String> magacin = new Magacin<>();
        Kutija<String> kutija = new Kutija<>("Test Sadrzaj");
        magacin.dodajKutiju(kutija);
        assertEquals(1, magacin.getKutije().size());
        assertEquals("Test Sadrzaj", magacin.getKutije().getFirst().getSadrzaj());
    }
}
