package konferencija;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Konferencija {
    private String naziv;
    private LocalDate datumOdrzavanja;
    private List<Predavanje> predavanja;

    public Konferencija(String naziv, LocalDate datumOdrzavanja) {
        this.naziv = naziv;
        this.datumOdrzavanja = datumOdrzavanja;
        this.predavanja = new ArrayList<>();
    }

    public void dodajPredavanje(String nazivPredavanja, String imePredavaca, int trajanje) {
        predavanja.add(new Predavanje(nazivPredavanja, imePredavaca, trajanje));
    }

    public String prikaziPredavanja() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Predavanja:\n");
        for (Predavanje p: predavanja) {
            sb.append("    ").append(p).append("\n");
        }
        return sb.toString();
    }

    public static class Predavanje {
        private String naziv;
        private String predavac;
        private int trajanje;
        public Predavanje(String naziv, String predavac, int trajanje) {
            this.naziv = naziv;
            this.predavac = predavac;
            this.trajanje = trajanje;
        }
        @Override
        public String toString() {
            return String.format("%s - %s (%d min)", naziv, predavac, trajanje);
        }
    }
}

