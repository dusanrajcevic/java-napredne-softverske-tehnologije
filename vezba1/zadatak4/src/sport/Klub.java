package sport;

import osobe.Igrac;
import java.util.List;
import java.util.ArrayList;

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
}

