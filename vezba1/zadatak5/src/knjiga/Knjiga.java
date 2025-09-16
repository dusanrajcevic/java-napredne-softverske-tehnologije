package knjiga;

public class Knjiga implements Comparable<Knjiga> {
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

    public Knjiga(Knjiga k) {
        this.id = k.id;
        this.naziv = k.naziv;
        this.autor = k.autor;
        this.godinaIzdanja = k.godinaIzdanja;
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

    @Override
    public int compareTo(Knjiga o) {
        return Integer.compare(this.godinaIzdanja, o.godinaIzdanja);
    }

    @Override
    public String toString() {
        return String.format("%d. %s - %s (%d)", id, naziv, autor, godinaIzdanja);
    }
}
