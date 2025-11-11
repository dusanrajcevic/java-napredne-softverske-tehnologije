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
}
