package biblioteka;

import knjiga.Knjiga;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private final String naziv;
    private final List<Clan> clanovi;
    private final List<Knjiga> knjige;

    public Biblioteka(String naziv) {
        this.naziv = naziv;
        this.clanovi = new ArrayList<>();
        this.knjige = new ArrayList<>();
    }
}
