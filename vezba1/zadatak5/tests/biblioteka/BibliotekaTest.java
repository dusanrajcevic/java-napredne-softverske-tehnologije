package biblioteka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BibliotekaTest {
    @Test
    public void testKreiranjeBiblioteke() {
        assertDoesNotThrow(() -> {
            new Biblioteka("Narodna biblioteka");
        });
    }
}
