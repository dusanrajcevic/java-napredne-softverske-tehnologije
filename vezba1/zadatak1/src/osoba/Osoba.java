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
        return LocalDate.now().getYear() - datumRodjenja().getYear();
    }

    @Override
    public String toString() {
        return imePrezime + " (" + getGodine() + ")";
    }

    private int danRodjenja() {
        return Integer.parseInt(jmbg.substring(0, 2));
    }

    private int mesecRodjenja() {
        return Integer.parseInt(jmbg.substring(2, 4));
    }

    private int godinaRodjenja() {
        int godina = Integer.parseInt(jmbg.substring(4, 7));
        return godina + ((godina < 100) ? 2000 : 1000);
    }

    private LocalDate datumRodjenja() {
        return LocalDate.of(godinaRodjenja(), mesecRodjenja(), danRodjenja());
    }
}
