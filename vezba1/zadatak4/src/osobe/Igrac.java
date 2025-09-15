package osobe;

public class Igrac {
    private static int nextId = 1;
    private final int id;
    private final String imePrezime;
    private final int godine;

    public Igrac(String imePrezime, int godine) {
        this.id = nextId++;
        this.imePrezime = imePrezime;
        this.godine = godine;
    }

    public int getId() {
        return id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getGodine() {
        return godine;
    }

    @Override
    public String toString() {
        return String.format("%d. %s (%d)", id, imePrezime, godine);
    }
}