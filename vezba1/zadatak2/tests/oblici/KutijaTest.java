package oblici;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KutijaTest {

    @Test
    public void testKreiranjeKutije() {
        Kutija k1 = new Kutija(10, 20, 30);
        Kutija k2 = new Kutija(20, 30, 40);
        assertTrue(k1.getId() > 0);
        assertTrue(k2.getId() > 0);
        assertTrue(k1.getId() != k2.getId());
    }
}
