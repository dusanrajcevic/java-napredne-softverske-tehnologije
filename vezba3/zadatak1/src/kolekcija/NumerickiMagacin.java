package kolekcija;

public class NumerickiMagacin<T extends Number> extends Magacin<T> {
    public double zbir() {
        double suma = 0;
        for (Kutija<T> k : kutije) {
            suma += k.getSadrzaj().doubleValue();
        }
        return suma;
    }
}

