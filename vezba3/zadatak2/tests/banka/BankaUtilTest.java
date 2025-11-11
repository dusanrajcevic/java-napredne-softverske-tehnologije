package banka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankaUtilTest {
    @Test
    public void testPrebaciKlijenta()
    {
        Banka<Number> banka1 = new Banka<>("Banka 1");
        Klijent k1 = new Klijent("Ana", "Anic");
        k1.dodajRacun(new Racun<>(100));
        banka1.dodajKlijenta(k1);

        Banka<Object> banka2 = new Banka<>("Banka 2");

        BankaUtil.prebaciKlijente(banka1, banka2);

        assertTrue(banka1.getKlijenti().isEmpty());
        assertEquals(1, banka2.getKlijenti().size());
    }
}
