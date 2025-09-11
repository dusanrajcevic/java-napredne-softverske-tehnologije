package osoba;

public class Osoba {
    private final String imePrezime;
    private final String pol;
    private final String jmbg;

    public Osoba(String imePrezime, String pol, String jmbg) {
        this.imePrezime = imePrezime;
        this.pol = pol;
        this.jmbg = jmbg;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getPol() {
        return pol;
    }

    public String getJmbg() {
        return jmbg;
    }
}
