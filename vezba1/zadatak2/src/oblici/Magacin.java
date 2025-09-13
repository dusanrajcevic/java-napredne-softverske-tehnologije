package oblici;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Magacin {
    private double povrsina;
    private List<Kontejner> kontejneri;

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
        int i = getKontejner(id);

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
        for (Kontejner k : kontejneri) {
            sb.append(k).append("\n");
        }
        return sb.toString();
    }

    private double ukupnaPovrsinaKontejneraUmagacinu()
    {
        double ukupnaPovrsina = 0;
        for (Kontejner k : kontejneri) {
            ukupnaPovrsina += k.povrsina();
        }
        return ukupnaPovrsina;
    }

    private int getKontejner(int id) {
        for (int i = 0; i < kontejneri.size(); i++) {
            if (kontejneri.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
