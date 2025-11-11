package kolekcija;

public class Kutija<T> {
    private static int ID = 0;
    private final int id;
    private final T sadrzaj;

    public Kutija(T sadrzaj) {
        this.sadrzaj = sadrzaj;
        this.id = ++ID;
    }

    public T getSadrzaj() {
        return sadrzaj;
    }

    @Override
    public String toString() {
        return id + ". " + sadrzaj;
    }
}

