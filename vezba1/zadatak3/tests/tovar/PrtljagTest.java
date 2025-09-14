package tovar;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

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

    @Test
    void testSortiranjePoTeziniNeopadajuce() {
        Prtljag p1 = new Prtljag("a", 20);
        Prtljag p2 = new Prtljag("b", 10);
        Prtljag p3 = new Prtljag("b", 30);
        List<Prtljag> prtljazi = new ArrayList<>(List.of(p1, p2, p3));

        Collections.sort(prtljazi);

        assertEquals(p1, prtljazi.get(1));
        assertEquals(p2, prtljazi.get(0));
        assertEquals(p3, prtljazi.get(2));
    }
}
