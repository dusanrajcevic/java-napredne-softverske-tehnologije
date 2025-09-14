package osoba;

import java.time.LocalDate;

class Jmbg {
    private final String jmbg;

    public Jmbg(String jmbg) {
        this.jmbg = jmbg;
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

    public LocalDate datumRodjenja() {
        return LocalDate.of(godinaRodjenja(), mesecRodjenja(), danRodjenja());
    }

    public String toString() {
        return jmbg;
    }
}
