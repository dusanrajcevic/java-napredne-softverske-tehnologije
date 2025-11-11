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

    @Test
    public void testToString() {
        Magacin<Integer> magacin = new Magacin<>();
        magacin.dodajKutiju(new Kutija<>(10));
        magacin.dodajKutiju(new Kutija<>(20));
        String expected = "Magacin:\n" +
                          "    1. 10\n" +
                          "    2. 20\n";
        assertEquals(expected, magacin.toString());
    }
}
