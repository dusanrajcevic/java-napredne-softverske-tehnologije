package fakultet;

import osoba.Osoba;
import java.util.ArrayList;
import java.util.List;

public class Fakultet {
    private final String naziv;
    private final Osoba dekan;
    private final List<Student> studenti;

    public Fakultet(String naziv, Osoba dekan) {
        this.naziv = naziv;
        this.dekan = dekan;
        this.studenti = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public Osoba getDekan() {
        return dekan;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public Fakultet upisiStudenta(Student s) {
        studenti.add(s);
        return this;
    }

    public boolean ispisiStudenta(String brojIndeksa) {
        return studenti.removeIf(s -> s.getBrojIndeksa().equals(brojIndeksa));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fakultet: ").append(naziv).append("\n")
                .append("- Dekan: ").append(dekan).append("\n")
                .append("--- Studenti:\n");
        studenti.forEach(
             s -> sb.append("------ ").append(s).append("\n")
        );
        return sb.toString();
    }
}
