package kolekcija;

public class NumerickiMagacin<T extends Number> extends Magacin<T> {
    public double zbir() {
        double suma = 0;
        for (Kutija<T> k : kutije) {
            suma += k.getSadrzaj().doubleValue();
        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numericki magacin (zbir=").append(zbir()).append("):\n");
        for (Kutija<T> k : kutije) {
            sb.append("    ").append(k).append("\n");
        }
        return sb.toString();
    }
}

