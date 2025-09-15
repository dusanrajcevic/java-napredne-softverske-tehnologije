package oblici;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Magacin {
    private final double povrsina;
    private final List<Kontejner> kontejneri;

    public Magacin(double povrsina) {
        this.povrsina = povrsina;
        this.kontejneri = new ArrayList<>();
    }

    public double getPovrsina() {
        return povrsina;
    }

    public List<Kontejner> getKontejneri() {
        return kontejneri;
    }

    public Magacin dodajKontejner(Kontejner kontejner) throws IllegalStateException {
        if (povrsina < ukupnaPovrsinaKontejneraUmagacinu() + kontejner.povrsina()) {
            throw new IllegalStateException("Nedovoljno prostora u magacinu!");
        }
        kontejneri.add(kontejner);
        return this;
    }

    public void ukloniKontejner(int id) {
        int i = getKontejnerIndex(id);

        if (i == -1) {
            throw new IllegalArgumentException("Nepostojeci kontejner!");
        }

        kontejneri.remove(i);
    }

    public void sortirajKontejnerePoPovrsiniNerastuce()
    {
        Collections.sort(kontejneri);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Magacin, P = %s\n", povrsina));
        kontejneri.forEach(k -> sb.append(k).append("\n"));
        return sb.toString();
    }

    private double ukupnaPovrsinaKontejneraUmagacinu()
    {
        return kontejneri.stream().mapToDouble(Kontejner::povrsina).sum();
    }

    private int getKontejnerIndex(int id) {
        return IntStream.range(0, kontejneri.size())
                .filter(i -> kontejneri.get(i).getId() == id)
                .findFirst()
                .orElse(-1);
    }
}
