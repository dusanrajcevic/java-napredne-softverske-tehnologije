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

    public void upisiStudenta(Student s) {
        studenti.add(s);
    }
}
