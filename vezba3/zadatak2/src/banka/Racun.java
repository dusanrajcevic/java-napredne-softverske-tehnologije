package banka;

public class Racun<T> {
    private static long BROJ_RACUNA = 0;
    private final long brojRacuna;
    private final T iznos;

    public Racun(T iznos) {
        this.brojRacuna = ++BROJ_RACUNA;
        this.iznos = iznos;
    }

    public long getBrojRacuna() {
        return brojRacuna;
    }

    public T getIznos() {
        return iznos;
    }

    @Override
    public String toString() {
        return brojRacuna + ". " + iznos;
    }
}

