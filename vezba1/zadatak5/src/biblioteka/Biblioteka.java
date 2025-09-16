package biblioteka;

import knjiga.Knjiga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Biblioteka {
    private final String naziv;
    private final List<Clan> clanovi;
    private final List<Knjiga> knjige;

    public Biblioteka(String naziv) {
        this.naziv = naziv;
        this.clanovi = new ArrayList<>();
        this.knjige = new ArrayList<>();
    }

    public Biblioteka dodajKnjigu(Knjiga knjiga) {
        this.knjige.add(knjiga);
        return this;
    }

    public Knjiga ukloniKnjigu(int id) {
        int i = knjigaIndex(id);

        if (i == -1) {
            throw new IllegalArgumentException("Nepostojeca knjiga");
        }

        return knjige.remove(i);
    }

    public int knjigaIndex(int id) {
        return IntStream.range(0, knjige.size())
                .filter(i -> knjige.get(i).getId() == id)
                .findFirst()
                .orElse(-1);
    }

    public Biblioteka upisiClana(Clan clan) {
        this.clanovi.add(clan);
        return this;
    }

    public Clan izbrisiClana(String clanskaKarta) {
        int i = clanZaClanskuKartu(clanskaKarta);

        if (i == -1) {
            throw new IllegalArgumentException("Nepostojeci clan");
        }

        return clanovi.remove(i);
    }

    public List<Knjiga> knjigePoGodiniIzdanja() {
        return knjige.stream().map(Knjiga::new).sorted().collect(Collectors.toList());
    }

    public String knjigePoGodiniIzdanjaString() {
        StringBuilder sb = new StringBuilder();
        knjigePoGodiniIzdanja().forEach(k -> sb.append("    ").append(k).append("\n"));
        return sb.toString();
    }

    public int clanZaClanskuKartu(String clanskaKarta) {
        return IntStream.range(0, clanovi.size())
                .filter(i -> clanovi.get(i).getBrojClanskeKarte().equals(clanskaKarta))
                .findFirst()
                .orElse(-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Biblioteka: %s\n--- Knjige:\n", naziv));
        knjige.forEach(k -> sb.append("    ").append(k).append("\n"));
        sb.append("--- Clanovi:\n");
        clanovi.forEach(c -> sb.append("    ").append(c).append("\n"));
        return sb.toString();
    }
}
