package artikli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelefonTest {
    @Test
    public void testTelefonToString() {
        Telefon telefon = new Telefon("iPhone 13", 999.99);
        String expected = "Telefon: iPhone 13 [999.99]";
        assertEquals(expected, telefon.toString());
    }
}
