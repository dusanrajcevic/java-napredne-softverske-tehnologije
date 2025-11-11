package kolekcija;

public class MagaciniUtil {
    public static <T> void prebaciSadrzaj(Magacin<? extends T> izvor, Magacin<? super T> odrediste) {
        for (Kutija<?> k : izvor.getKutije()) {
            ((Magacin) odrediste).dodajKutiju(k);
        }
        izvor.getKutije().clear();
    }
}