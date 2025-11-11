package kolekcija;

import java.util.ArrayList;
import java.util.List;

public class Magacin<T> {
    protected List<Kutija<T>> kutije;

    public Magacin() {
        kutije = new ArrayList<>();
    }

    public List<Kutija<T>> getKutije() {
        return kutije;
    }

    public void dodajKutiju(Kutija<T> kutija) {
        kutije.add(kutija);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Magacin:").append("\n");
        for (Kutija<T> k : kutije) {
            sb.append("    ").append(k).append("\n");
        }
        return sb.toString();
    }
}
