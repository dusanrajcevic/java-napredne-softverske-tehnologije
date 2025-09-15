package sport;

import osobe.Igrac;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Klub {
    private final String naziv;
    private final String sport;
    private final List<Igrac> igraci;

    public Klub(String naziv, String sport) {
        this.naziv = naziv;
        this.sport = sport;
        this.igraci = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public String getSport() {
        return sport;
    }

    public List<Igrac> getIgraci() {
        return new ArrayList<>(igraci);
    }

    public Klub dodajIgraca(Igrac igrac) {
        igraci.add(igrac);
        return this;
    }

    public void ukloniIgraca(int id) {
        int i = igracIndex(id);

        if (i == -1) {
            throw new IllegalArgumentException("Nepostojeci igrac");
        }

        igraci.remove(i);
    }

    public void sortirajPoGodinamaNeopadajuce() {
        igraci.sort(Comparator.comparingInt(Igrac::getGodine));
    }

    private int igracIndex(int id) {
        return IntStream.range(0, igraci.size())
                .filter(i -> igraci.get(i).getId() == id)
                .findFirst()
                .orElse(-1);
    }
}

