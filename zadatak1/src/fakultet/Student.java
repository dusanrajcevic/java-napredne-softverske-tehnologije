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

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + brojIndeksa + " [" + prosek + "]";
    }
}
