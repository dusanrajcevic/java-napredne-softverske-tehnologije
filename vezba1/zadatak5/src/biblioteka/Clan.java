package biblioteka;

public class Clan {
    private final String imePrezime;
    private final String brojClanskeKarte;

    public Clan(String imePrezime, String brojClanskeKarte) {
        this.imePrezime = imePrezime;
        this.brojClanskeKarte = brojClanskeKarte;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getBrojClanskeKarte() {
        return brojClanskeKarte;
    }
}
