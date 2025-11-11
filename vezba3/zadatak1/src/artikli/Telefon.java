package artikli;

public class Telefon {
    private final String model;
    private final double cena;

    public Telefon(String model, double cena) {
        this.model = model;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Telefon: " + model + " [" + cena + "]";
    }
}

