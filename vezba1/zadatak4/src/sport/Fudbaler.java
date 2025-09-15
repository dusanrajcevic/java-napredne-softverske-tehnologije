package sport;

import osobe.Igrac;

public class Fudbaler extends Igrac {
    private final Pozicija pozicija;

    public Fudbaler(String imePrezime, int godine, Pozicija pozicija) {
        super(imePrezime, godine);
        this.pozicija = pozicija;
    }

    public Pozicija getPozicija() {
        return pozicija;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + pozicija;
    }
}