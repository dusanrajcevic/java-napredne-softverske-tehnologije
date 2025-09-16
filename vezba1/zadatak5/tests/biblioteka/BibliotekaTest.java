package biblioteka;

import knjiga.Knjiga;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotekaTest {
    @Test
    public void testKreiranjeBiblioteke() {
        assertDoesNotThrow(() -> {
            new Biblioteka("Narodna biblioteka");
        });
    }

    @Test
    public void testDodavanjeKnjige() {
        assertDoesNotThrow(() -> {
            Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
            Knjiga knjiga1 = new Knjiga("Naslov knjige", "Autor knjige", 2020);
            Knjiga knjiga2 = new Knjiga("Naslov knjige 2", "Autor knjige 2", 2022);
            biblioteka.dodajKnjigu(knjiga1).dodajKnjigu(knjiga2);
        });
    }

    @Test
    public void testKnjigaIndexZaValidanIdVracaIndex() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Knjiga knjiga1 = new Knjiga("Naslov knjige", "Autor knjige", 2020);
        Knjiga knjiga2 = new Knjiga("Naslov knjige 2", "Autor knjige 2", 2022);
        biblioteka.dodajKnjigu(knjiga1).dodajKnjigu(knjiga2);
        assertEquals(0, biblioteka.knjigaIndex(knjiga1.getId()));
        assertEquals(1, biblioteka.knjigaIndex(knjiga2.getId()));
    }

    @Test
    public void testKnjigaIndexZaNepostojeciIdVracaMinus1() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Knjiga knjiga1 = new Knjiga("Naslov knjige", "Autor knjige", 2020);
        Knjiga knjiga2 = new Knjiga("Naslov knjige 2", "Autor knjige 2", 2022);
        biblioteka.dodajKnjigu(knjiga1).dodajKnjigu(knjiga2);
        assertEquals(-1, biblioteka.knjigaIndex(9999));
    }

    @Test
    public void testUklanjanjeKnjige() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Knjiga knjiga1 = new Knjiga("Naslov knjige", "Autor knjige", 2020);
        Knjiga knjiga2 = new Knjiga("Naslov knjige 2", "Autor knjige 2", 2022);
        biblioteka.dodajKnjigu(knjiga1).dodajKnjigu(knjiga2);
        biblioteka.ukloniKnjigu(knjiga1.getId());
        assertEquals(0, biblioteka.knjigaIndex(knjiga2.getId()));
        assertEquals(-1, biblioteka.knjigaIndex(knjiga1.getId()));
    }

    @Test
    public void testUklanjanjeNepostojeceKnjigeBacaIzuzetak() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Knjiga knjiga1 = new Knjiga("Naslov knjige", "Autor knjige", 2020);
        Knjiga knjiga2 = new Knjiga("Naslov knjige 2", "Autor knjige 2", 2022);
        biblioteka.dodajKnjigu(knjiga1).dodajKnjigu(knjiga2);
        assertThrows(IllegalArgumentException.class, () -> biblioteka.ukloniKnjigu(9999));
    }

    @Test
    public void testUpisClanova() {
        assertDoesNotThrow(() -> {
            Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
            Clan clan1 = new Clan("Pera Peric", "01234567");
            Clan clan2 = new Clan("Pera Peric 2", "012345678");
            biblioteka.upisiClana(clan1).upisiClana(clan2);
        });
    }

    @Test
    public void testClanIndexZaValidnuClanskuKartuVracaIndex() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Clan clan1 = new Clan("Pera Peric", "01234567");
        Clan clan2 = new Clan("Pera Peric 2", "012345678");
        biblioteka.upisiClana(clan1).upisiClana(clan2);
        assertEquals(0, biblioteka.clanZaClanskuKartu(clan1.getBrojClanskeKarte()));
        assertEquals(1, biblioteka.clanZaClanskuKartu(clan2.getBrojClanskeKarte()));
    }

    @Test
    public void testClanIndexZaNepostojecuClanskuKartuVracaMinus1() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Clan clan1 = new Clan("Pera Peric", "01234567");
        Clan clan2 = new Clan("Pera Peric 2", "012345678");
        biblioteka.upisiClana(clan1).upisiClana(clan2);
        assertEquals(-1, biblioteka.clanZaClanskuKartu("99999999") );
    }

    @Test
    public void testIzbrisClana() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Clan clan1 = new Clan("Pera Peric", "01234567");
        Clan clan2 = new Clan("Pera Peric 2", "012345678");
        biblioteka.upisiClana(clan1).upisiClana(clan2);
        biblioteka.izbrisiClana(clan1.getBrojClanskeKarte());
        assertEquals(0, biblioteka.clanZaClanskuKartu(clan2.getBrojClanskeKarte()));
        assertEquals(-1, biblioteka.clanZaClanskuKartu(clan1.getBrojClanskeKarte()));
    }

    @Test
    public void testIzbrisNepostojecgClanaBacaIzuzetak() {
        Biblioteka biblioteka = new Biblioteka("Narodna biblioteka");
        Clan clan1 = new Clan("Pera Peric", "01234567");
        Clan clan2 = new Clan("Pera Peric 2", "012345678");
        biblioteka.upisiClana(clan1).upisiClana(clan2);
        assertThrows(IllegalArgumentException.class, () -> biblioteka.izbrisiClana("99999999"));
    }

}
