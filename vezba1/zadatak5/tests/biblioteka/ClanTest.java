package biblioteka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClanTest {
    private Clan clan;

    @BeforeEach
    public void setUp() {
        clan = new Clan("Pera Peric", "01234567");
    }

    @Test
    public void testKreiranjeClana() {
        assertEquals("Pera Peric", clan.getImePrezime());
        assertEquals("01234567", clan.getBrojClanskeKarte());
    }

    @Test
    public void testToStringFormat() {
        assertEquals("Pera Peric - 01234567", clan.toString());
    }
}
