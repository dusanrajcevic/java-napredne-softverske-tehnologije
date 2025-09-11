package osoba;

import java.time.LocalDate;

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

    public int getGodine() {
        int godina = Integer.parseInt(jmbg.substring(4, 7));
        godina += (godina < 100) ? 2000 : 1000;
        int mesec = Integer.parseInt(jmbg.substring(2, 4));
        int dan = Integer.parseInt(jmbg.substring(0, 2));
        LocalDate datumRodjenja = LocalDate.of(godina, mesec, dan);
        return LocalDate.now().getYear() - datumRodjenja.getYear();
    }
}
