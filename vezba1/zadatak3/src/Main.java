import prevoz.TeretnoVozilo;
import tovar.Prtljag;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeretnoVozilo vozilo = new TeretnoVozilo(1000, "Zastava");
        List<Prtljag> prtljazi = new ArrayList<>(
            List.of(
                new Prtljag("Dzak", 650),
                new Prtljag("Torba", 75),
                new Prtljag("Dzak", 400),
                new Prtljag("Kesa", 300),
                new Prtljag("Ranac", 45)
            )
        );

        prtljazi.forEach(v -> {
            try {
                vozilo.dodajPrtljag(v);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        });

        System.out.println(vozilo);

        try {
            vozilo.istovariPrtljag(4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            vozilo.dodajPrtljag(new Prtljag("Kesa", 29));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---");
        System.out.println("Nakon dodavanja kese: ");
        System.out.println(vozilo);
    }
}
