package oblici;

public class Kutija extends Kontejner {
    private double visina;
    private double sirina;
    private double duzina;

    public Kutija(double visina, double sirina, double duzina) {
        super("Kutija");
        this.visina = visina;
        this.sirina = sirina;
        this.duzina = duzina;
    }

    @Override
    public double povrsina() {
        return 2 * (visina * sirina + visina * duzina + sirina * duzina);
    }

    @Override
    public double zapremina() {
        return visina * sirina * duzina;
    }
}
