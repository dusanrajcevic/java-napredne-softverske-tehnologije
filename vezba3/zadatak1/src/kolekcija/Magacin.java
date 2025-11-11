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
}
