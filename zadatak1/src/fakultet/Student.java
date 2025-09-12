package fakultet;

import osoba.Osoba;

public class Student extends Osoba {
    private String brojIndeksa;
    private double prosek;

    public Student(String imePrezime, String pol, String jmbg, String brojIndeksa, double prosek) {
        super(imePrezime, pol, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.prosek = prosek;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public double getProsek() {
        return prosek;
    }
}
