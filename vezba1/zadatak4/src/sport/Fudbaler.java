package sport;

import osobe.Igrac;

public class Fudbaler extends Igrac {
    private final String pozicija;

    public Fudbaler(String imePrezime, int godine, String pozicija) {
        super(imePrezime, godine);
        this.pozicija = pozicija;
    }

    public String getPozicija() {
        return pozicija;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + pozicija;
    }
}