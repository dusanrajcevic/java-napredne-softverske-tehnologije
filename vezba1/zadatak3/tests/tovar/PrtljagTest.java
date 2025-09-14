package tovar;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PrtljagTest {

    @Test
    public void testKreiranjePrtljaga() {
        for(int i = 0; i < 100; i++) {
            String naziv = "Prtljag " + i;
            double tezina = Math.random() * 100;
            Prtljag p = new Prtljag(naziv, tezina);
            assertEquals(naziv, p.getNaziv());
            assertEquals(tezina, p.getTezina());
            assertTrue(p.getId() > 0);
        }
    }

    @Test
    void testJedinstvenId() {
        for(int i = 0; i < 100; i++) {
            String naziv = "Prtljag " + i;
            double tezina = Math.random() * 100;
            Prtljag p = new Prtljag(naziv, tezina);
            assertEquals(naziv, p.getNaziv());
            assertEquals(tezina, p.getTezina());
            assertTrue(p.getId() > 0);
        }
    }
}
