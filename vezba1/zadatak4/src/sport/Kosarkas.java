package sport;

import osobe.Igrac;

public class Kosarkas extends Igrac {
    private final int visina;

    public Kosarkas(String imePrezime, int godine, int visina) {
        super(imePrezime, godine);
        this.visina = visina;
    }

    public int getVisina() {
        return visina;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + visina + "cm";
    }
}

