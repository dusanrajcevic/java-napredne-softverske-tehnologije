package festival;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
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

    public void sortirajNastupePoTrajanju() {
        nastupi.sort(new Comparator<Nastup>() {
            @Override
            public int compare(Nastup n1, Nastup n2) {
                return Integer.compare(n1.trajanje, n2.trajanje);
            }
        });
    }

    public String prikaziRaspored(int sat, int minut, int pauza) {
         class Satnica {
            private final int sat;
            private final int minut;
            private final Nastup nastup;

            public Satnica(int sat, int minut, Nastup nastup) {
                this.sat = sat;
                this.minut = minut;
                this.nastup = nastup;
            }

            @Override
            public String toString() {
                return String.format("%02d:%02d - %s", sat, minut, nastup);
            }
        }

        if (nastupi.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("--- Raspored (%s):\n", datum()));
        for (Nastup n : nastupi) {
            Satnica s = new Satnica(sat, minut, n);
            sb.append("    ").append(s).append("\n");
            minut += n.trajanje + pauza;
            sat += minut / 60;
            minut = minut % 60;
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

    private String datum() {
        return datumOdrzavanja.getDayOfMonth() + "." + datumOdrzavanja.getMonthValue() + "." + datumOdrzavanja.getYear();
    }
}
