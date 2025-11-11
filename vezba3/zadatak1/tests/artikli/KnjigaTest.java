package artikli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnjigaTest {
    @Test
    public void testKnjigaToString() {
        Knjiga knjiga = new Knjiga("1984", "George Orwell");
        String expected = "Knjiga: 1984 - George Orwell";
        assertEquals(expected, knjiga.toString());
    }
}
