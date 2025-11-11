package banka;

public class FinansijskaBanka<T extends Number> extends Banka<T> {
    public FinansijskaBanka(String naziv) {
        super(naziv);
    }

    public double ukupno() {
        double sum = 0.0;
        for (Klijent k : getKlijenti()) {
            for (Racun<?> r : k.getRacuni()) {
                Object val = r.getIznos();
                if (val instanceof Number) {
                    sum += ((Number) val).doubleValue();
                }
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Finansijska banka (ukupno=" + ukupno() + ")" + "\n" + super.toString();
    }
}

