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
        return -1;
    }

    @Override
    public double zapremina() {
        return -1;
    }
}
