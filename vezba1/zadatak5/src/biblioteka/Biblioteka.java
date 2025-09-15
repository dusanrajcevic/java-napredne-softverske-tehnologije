package biblioteka;

import knjiga.Knjiga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Biblioteka {
    private final String naziv;
    private final List<Clan> clanovi;
    private final List<Knjiga> knjige;

    public Biblioteka(String naziv) {
        this.naziv = naziv;
        this.clanovi = new ArrayList<>();
        this.knjige = new ArrayList<>();
    }

    public Biblioteka dodajKnjigu(Knjiga knjiga) {
        this.knjige.add(knjiga);
        return this;
    }

}
