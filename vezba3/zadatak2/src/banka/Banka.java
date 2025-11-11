package banka;

import java.util.ArrayList;
import java.util.List;

public class Banka<T> {
    private final String naziv;
    private final List<Klijent> klijenti;

    public Banka(String naziv) {
        this.naziv = naziv;
        this.klijenti = new ArrayList<>();
    }

    public List<Klijent> getKlijenti() {
        return klijenti;
    }

    public void dodajKlijenta(Klijent k) {
        klijenti.add(k);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banka: ").append(naziv).append("\n");
        sb.append("Klijenti:\n");
        for (Klijent k : klijenti) {
            sb.append(k.toString());
        }
        return sb.toString();
    }
}

