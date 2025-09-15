package prevoz;

import tovar.Prtljag;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TeretnoVozilo extends Vozilo {
    private final List<Prtljag> prtljazi;

    public TeretnoVozilo(double maxTezina, String marka) {
        super(maxTezina, marka);
        prtljazi = new ArrayList<>();
    }

    public TeretnoVozilo dodajPrtljag(Prtljag prtljag) throws IllegalArgumentException {
        if (ukupnaTezinaPrtljaga() + prtljag.getTezina() > getMaxTezina()) {
            throw new IllegalArgumentException("Prtljag prelazi maksimalnu tezinu");
        }

        prtljazi.add(prtljag);
        return this;
    }

    public double ukupnaTezinaPrtljaga() {
        return prtljazi.stream().mapToDouble(Prtljag::getTezina).sum();
    }

    public Prtljag istovariPrtljag(int id) throws IllegalArgumentException {
        int indeks = getIndeksPrtljaga(id);

        if (indeks == -1) {
            throw new IllegalArgumentException("Nepostojeci prtljag");
        }

        return prtljazi.remove(indeks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append("\n  Prtljag:\n");
        prtljazi.forEach(p -> sb.append("    ").append(p).append("\n"));
        sb.append("  Ukupno: ").append(String.format("%.2f", ukupnaTezinaPrtljaga()));
        return sb.toString();
    }

    private int getIndeksPrtljaga(int id) {
        return IntStream.range(0, prtljazi.size())
                .filter(i -> prtljazi.get(i).getId() == id)
                .findFirst()
                .orElse(-1);
    }
}
