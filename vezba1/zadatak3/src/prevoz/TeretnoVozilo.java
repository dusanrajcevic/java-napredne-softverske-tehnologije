package prevoz;

import tovar.Prtljag;

import java.util.ArrayList;
import java.util.List;

public class TeretnoVozilo extends Vozilo {
    private final List<Prtljag> prtljazi;

    public TeretnoVozilo(double maxTezina, String marka) {
        super(maxTezina, marka);
        prtljazi = new ArrayList<>();
    }
}
