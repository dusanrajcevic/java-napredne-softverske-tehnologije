package banka;

import java.util.ArrayList;
import java.util.List;

public class Klijent {
    private final String ime;
    private final String prezime;
    private final List<Racun<?>> racuni;

    public Klijent(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.racuni = new ArrayList<>();
    }

    public List<Racun<?>> getRacuni() {
        return racuni;
    }

    public void dodajRacun(Racun<?> r) {
        racuni.add(r);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Klijent: ").append(ime).append(" ").append(prezime).append("\n");
        sb.append("--- Racuni:").append("\n");
        for (Racun<?> r : racuni) {
            sb.append("    ").append(r.toString()).append("\n");
        }
        return sb.toString();
    }
}

