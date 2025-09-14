package prevoz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeretnoVoziloTest {

    @Test
    public void testKreiranjeTeretnogVozila() {
        TeretnoVozilo tv = new TeretnoVozilo(5000, "Volvo");
        assertEquals(5000, tv.getMaxTezina());
        assertEquals("Volvo", tv.getMarka());
    }
}
