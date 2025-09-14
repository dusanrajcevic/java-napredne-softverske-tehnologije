package prevoz;

public class Vozilo {
    private double maxTezina;
    private String marka;

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
}
