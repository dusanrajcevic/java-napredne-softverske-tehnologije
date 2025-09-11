package osoba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OsobaTest {

    @Test
    public void testKreiranjeOsobe() {
        Osoba o = new Osoba("Petar Petrovic", "M", "0101995123456");
        assertEquals("Petar Petrovic", o.getImePrezime());
        assertEquals("M", o.getPol());
        assertEquals("0101995123456", o.getJmbg());
    }
}
