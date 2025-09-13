package oblici;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KontejnerTest {

    @Test
    public void testKreiranjeKontejnera() {
        for(int i = 0; i < 100; i++) {
            String naziv = "Kocka" + i;
            Kontejner k = new Kocka(naziv);
            assertEquals(naziv, k.naziv);
            assertEquals(i + 1, k.getId());
        }
    }

    static class Kocka extends Kontejner {
        public Kocka(String naziv) {
            super(naziv);
        }

        @Override
        public double povrsina() {
            return -1;
        }

        @Override
        public double zapremina() {
            return -1;
        }
    }
}
