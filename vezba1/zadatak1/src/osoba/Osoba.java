package osoba;

import java.time.LocalDate;

public class Osoba {
    private final String imePrezime;
    private final String pol;
    private final Jmbg jmbg;

    public Osoba(String imePrezime, String pol, String jmbg) {
        this.imePrezime = imePrezime;
        this.pol = pol;
        this.jmbg = new Jmbg(jmbg);
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getPol() {
        return pol;
    }

    public String getJmbg() {
        return jmbg.toString();
    }

    public int getGodine() {
        return LocalDate.now().getYear() - jmbg.datumRodjenja().getYear();
    }

    @Override
    public String toString() {
        return imePrezime + " (" + getGodine() + ")";
    }
}
