package artikli;

public class Knjiga {
    private final String naziv;
    private final String autor;

    public Knjiga(String naziv, String autor) {
        this.naziv = naziv;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Knjiga: " + naziv + " - " + autor;
    }
}

