package konferencija;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Konferencija {
    private final String naziv;
    private final LocalDate datumOdrzavanja;
    private final List<Predavanje> predavanja;

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

    public String ispisiAgendu(int sat, int minut, int pauza) {
        class Termin {
            private final int sat;
            private final int minut;
            private final Predavanje predavanje;
            Termin(int sat, int minut, Predavanje predavanje) {
                this.sat = sat;
                this.minut = minut;
                this.predavanje = predavanje;
            }
            @Override
            public String toString() {
                return String.format("    %02d:%02d - %s", sat, minut, predavanje);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("--- Agenda (%s):\n", datum()));

        for (Predavanje p : predavanja) {
            Termin t = new Termin(sat, minut, p);
            sb.append(t).append("\n");
            minut += p.trajanje + pauza;
            sat += minut / 60;
            minut = minut % 60;
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        predavanja.sort(new Comparator<Predavanje>() {
            @Override
            public int compare(Predavanje p1, Predavanje p2) {
                return Integer.compare(p1.trajanje, p2.trajanje);
            }
        });

        return String.format("Konferencija: %s (%d)\n%s", naziv, datumOdrzavanja.getYear(), prikaziPredavanja());
    }

    public static class Predavanje {
        private final String naziv;
        private final String predavac;
        private final int trajanje;
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

    private String datum() {
        return datumOdrzavanja.getDayOfMonth() + "." + datumOdrzavanja.getMonthValue() + "." + datumOdrzavanja.getYear();
    }
}

