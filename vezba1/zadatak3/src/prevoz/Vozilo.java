package prevoz;

public class Vozilo {
    private final double maxTezina;
    private final String marka;

    public Vozilo(double maxTezina, String marka) {
        this.maxTezina = maxTezina;
        this.marka = marka;
    }

    public double getMaxTezina() {
        return maxTezina;
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return String.format("%s [%.0f]", marka, maxTezina);
    }
}
