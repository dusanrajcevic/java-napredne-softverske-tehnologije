package knjiga;

public class Knjiga {
    private static int ID = 1;
    private final int id;
    private final String naziv;
    private final String autor;
    private final int godinaIzdanja;

    public Knjiga(String naziv, String autor, int godinaIzdanja) {
        this.id = ID++;
        this.naziv = naziv;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getAutor() {
        return autor;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }
}
