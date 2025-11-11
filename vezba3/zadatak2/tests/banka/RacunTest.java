package banka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacunTest {
    @BeforeEach
    public void setUp() throws Exception {
        Field brojRacuna = Racun.class.getDeclaredField("BROJ_RACUNA");
        brojRacuna.setAccessible(true);
        brojRacuna.setInt(null, 0);
        brojRacuna.setAccessible(false);
    }

    @Test
    public void testGetBrojRacuna() throws Exception {
        Racun<Integer> r1 = new Racun<>(10);
        Racun<Integer> r2 = new Racun<>(20);

        assertEquals(1, r1.getBrojRacuna());
        assertEquals(2, r2.getBrojRacuna());
    }

    @Test
    public void testIznos() {
        Racun<Double> r1 = new Racun<>(100.0);
        Racun<Double> r2 = new Racun<>(200.0);

        assertEquals(100.0, r1.getIznos());
        assertEquals(200.0, r2.getIznos());
    }

    @Test
    public void testToString() {
        Racun<Integer> r = new Racun<>(42);
        String expected = "1. 42";
        assertEquals(expected, r.toString());
    }
}
