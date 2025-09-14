package tovar;

public class Prtljag {
    private static int ID = 1;
    private final int id;
    private final String naziv;
    private final double tezina;

    public Prtljag(String naziv, double tezina) {
        this.id = ID++;
        this.naziv = naziv;
        this.tezina = tezina;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getTezina() {
        return tezina;
    }
}
