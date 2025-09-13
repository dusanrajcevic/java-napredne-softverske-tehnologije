package oblici;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BureTest {
    @Test
    public void testKreiranjeBure() {
        Bure b = new Bure(10, 20);
        assertEquals("Bure", b.naziv);
        assertEquals(1, b.getId());
    }

    @Test
    public void testPovrsina() {
        Bure b = new Bure(10, 20);
        double expectedPovrsina = 2 * Math.pow(5, 2) * Math.PI + 2 * 5 * Math.PI * 20;
        assert Math.abs(expectedPovrsina - b.povrsina()) < 0.0001;
    }


}
