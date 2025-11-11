package kolekcija;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MagacinUtilTest {
    @Test
    public void testPrebaciSadrzaj()
    {
        Magacin<Integer> magacin1 = new Magacin<>();
        magacin1.dodajKutiju(new Kutija<>(3));
        magacin1.dodajKutiju(new Kutija<>(5));

        Magacin<Number> magacin2 = new Magacin<>();
        magacin2.dodajKutiju(new Kutija<>(5));

        MagaciniUtil.prebaciSadrzaj(magacin1, magacin2);

        assertTrue(magacin1.getKutije().isEmpty());
        assertEquals(3, magacin2.getKutije().size());
    }
}
