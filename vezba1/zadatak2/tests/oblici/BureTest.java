package oblici;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BureTest {
    @Test
    public void testKreiranjeBure() {
        Bure b = new Bure(10, 20);
        assertEquals("Bure", b.naziv);
        assertEquals(1, b.getId());
    }


}
