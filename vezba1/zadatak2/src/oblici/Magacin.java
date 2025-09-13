package oblici;

import java.util.ArrayList;
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

    private double ukupnaPovrsinaKontejneraUmagacinu()
    {
        double ukupnaPovrsina = 0;
        for (Kontejner k : kontejneri) {
            ukupnaPovrsina += k.povrsina();
        }
        return ukupnaPovrsina;
    }
}
