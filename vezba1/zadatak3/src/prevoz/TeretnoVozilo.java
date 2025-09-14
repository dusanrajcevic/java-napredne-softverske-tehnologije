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

    public TeretnoVozilo dodajPrtljag(Prtljag prtljag) {
        if (ukupnaTezinaPrtljaga() + prtljag.getTezina() > getMaxTezina()) {
            throw new IllegalArgumentException("Prtljag prelazi maksimalnu tezinu");
        }

        prtljazi.add(prtljag);
        return this;
    }

    public double ukupnaTezinaPrtljaga() {
        double ukupnaTezina = 0;
        for (Prtljag p: prtljazi) {
            ukupnaTezina += p.getTezina();
        }
        return ukupnaTezina;
    }
}
