package festival;

import java.time.LocalDate;
import java.util.ArrayList;;
import java.util.List;

public class Festival {
    private final String naziv;
    private final LocalDate datumOdrzavanja;
    private final List<Nastup> nastupi;

    public Festival(String naziv, LocalDate datumOdrzavanja) {
        this.naziv = naziv;
        this.datumOdrzavanja = datumOdrzavanja;
        this.nastupi = new ArrayList<>();
    }

    public Festival dodajNastup(String nazivBenda, int trajanje) {
        nastupi.add(new Nastup(nazivBenda, trajanje));

        return this;
    }

    public String prikaziNastupe() {
        if (nastupi.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("--- Nastupi:\n");
        for (Nastup n : nastupi) {
            sb.append("    ").append(n).append("\n");
        }
        return sb.toString();
    }

    private class Nastup {
        private final String nazivIzvodjaca;
        private final int trajanje;

        public Nastup(String nazivIzvodjaca, int trajanje) {
            this.nazivIzvodjaca = nazivIzvodjaca;
            this.trajanje = trajanje;
        }

        @Override
        public String toString() {
            return nazivIzvodjaca + " (" + trajanje + " min)";
        }
    }
}
