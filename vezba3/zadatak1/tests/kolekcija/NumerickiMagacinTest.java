package kolekcija;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerickiMagacinTest {
    @Test
    public void testZbir() {
        NumerickiMagacin<Integer> magacin = new NumerickiMagacin<>();
        magacin.dodajKutiju(new Kutija<>(10));
        magacin.dodajKutiju(new Kutija<>(20));
        magacin.dodajKutiju(new Kutija<>(30));
        assertEquals(60.0, magacin.zbir(), 0.001);
    }

    @Test
    public void testToString() {
        NumerickiMagacin<Double> magacin = new NumerickiMagacin<>();
        magacin.dodajKutiju(new Kutija<>(10.5));
        magacin.dodajKutiju(new Kutija<>(20.5));
        String expected = "Numericki magacin (zbir=31.0):\n" +
                          "    1. 10.5\n" +
                          "    2. 20.5\n";
        assertEquals(expected, magacin.toString());
    }
}
