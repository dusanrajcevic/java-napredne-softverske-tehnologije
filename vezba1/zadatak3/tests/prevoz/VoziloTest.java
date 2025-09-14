package prevoz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoziloTest {

    @Test
    public void testKreiranjeVozila() {
        Vozilo v = new Vozilo(1000, "Toyota");
        assertEquals(1000, v.getMaxTezina());
        assertEquals("Toyota", v.getMarka());
    }
}
