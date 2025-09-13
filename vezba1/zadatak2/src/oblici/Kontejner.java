package oblici;

public abstract class Kontejner implements Comparable<Kontejner> {
    protected String naziv;
    protected int id;
    private static int ID = 0;

    public Kontejner(String naziv) {
        this.naziv = naziv;
        this.id = ++ID;
    }

    public int getId() {
        return id;
    }

    public abstract double povrsina();
    public abstract double zapremina();

    @Override
    public int compareTo(Kontejner kontejner) {
        return Double.compare(povrsina(), kontejner.povrsina());
    }
}
