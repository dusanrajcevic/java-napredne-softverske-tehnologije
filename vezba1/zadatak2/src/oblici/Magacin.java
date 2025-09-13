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
}
