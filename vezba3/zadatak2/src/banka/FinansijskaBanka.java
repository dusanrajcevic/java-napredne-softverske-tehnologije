package banka;

public class FinansijskaBanka<T extends Number> extends Banka<T> {
    public FinansijskaBanka(String naziv) {
        super(naziv);
    }

    public double ukupno() {
        return getKlijenti().stream()
                .flatMap(k -> k.getRacuni().stream())
                .mapToDouble(r -> {
                    Object v = r.getIznos();
                    return (v instanceof Number) ? ((Number) v).doubleValue() : 0.0;
                }).sum();
    }

    @Override
    public String toString() {
        return "Finansijska banka (ukupno=" + ukupno() + ")" + "\n" + super.toString();
    }
}

