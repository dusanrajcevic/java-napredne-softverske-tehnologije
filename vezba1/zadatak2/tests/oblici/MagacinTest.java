package oblici;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MagacinTest {

    @Test
    public void testKreiranjeMagacina() {
        Magacin m = new Magacin(900);
        assertEquals(900, m.getPovrsina());
        assertTrue(m.getKontejneri().isEmpty());
    }
}
