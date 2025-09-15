package biblioteka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClanTest {

    @Test
    public void testKreiranjeClana() {
        Clan c = new Clan("Pera Peric", "01234567");
        assertEquals("Pera Peric", c.getImePrezime());
        assertEquals("01234567", c.getBrojClanskeKarte());
    }
}
