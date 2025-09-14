package osoba;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class JmbgTest {

    @Test
    public void testDatumRodjenjaPre2000() {
        Jmbg jmbg = new Jmbg("0101995123456");
        assertEquals(LocalDate.of(1995,1,1), jmbg.datumRodjenja());
    }

    @Test
    public void testDatumRodjenjaPosle2000() {
        Jmbg jmbg = new Jmbg("0101005123456");
        assertEquals(LocalDate.of(2005,1,1), jmbg.datumRodjenja());
    }

    @Test
    public void testToString() {
        Jmbg jmbg = new Jmbg("0101995123456");
        assertEquals("0101995123456", jmbg.toString());
    }
}
