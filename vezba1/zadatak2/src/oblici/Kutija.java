package oblici;

public class Kutija extends Kontejner {
    private final double visina;
    private final double sirina;
    private final double duzina;

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

    @Override
    public String toString() {
        return String.format("%d. %s P = %.2f, V = %.2f", id, naziv, povrsina(), zapremina());
    }
}
