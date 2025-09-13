package oblici;

public class Bure extends Kontejner {
    private double precnik;
    private double visina;

    public Bure(double precnik, double visina) {
        super("Bure");
        this.precnik = precnik;
        this.visina = visina;
    }

    @Override
    public double povrsina() {
        return 2 * Math.pow(poluprecnik(), 2) * Math.PI + 2 * poluprecnik() * Math.PI * visina;
    }

    @Override
    public double zapremina() {
        return -1;
    }

    private double poluprecnik() {
        return precnik / 2;
    }
}
