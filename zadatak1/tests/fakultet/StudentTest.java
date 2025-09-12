package fakultet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class StudentTest {

    @Test
    public void testKreiranjeStudenta() {
        Student s = new Student("Petar Petrovic", "M", "0101995123456", "I004-15/2025", 9.5);
        assertEquals("Petar Petrovic", s.getImePrezime());
        assertEquals("M", s.getPol());
        assertEquals("0101995123456", s.getJmbg());
        assertEquals("I004-15/2025", s.getBrojIndeksa());
        assertEquals(9.5, s.getProsek());
    }
}
