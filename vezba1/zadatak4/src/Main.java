import sport.Fudbaler;
import sport.Kosarkas;
import sport.Klub;
import sport.Pozicija;

public class Main {
    public static void main(String[] args) {
        Klub klub = new Klub("Crvena Zvezda", "fudbal");
        Fudbaler f1 = new Fudbaler("Marko Markovic", 25, Pozicija.ODBRAMBENI);
        Fudbaler f2 = new Fudbaler("Petar Petrovic", 22, Pozicija.NAPADAC);
        Kosarkas k1 = new Kosarkas("Jovan Jovanovic", 27, 198);

        klub.dodajIgraca(f1).dodajIgraca(f2).dodajIgraca(k1);

        System.out.println("--- Klub bez sortiranja ---");
        System.out.print(klub);

        klub.sortirajPoGodinamaNeopadajuce();
        System.out.println("--- Klub sa sortiranim igracima ---");
        System.out.print(klub);

        klub.ukloniIgraca(f2.getId());
        System.out.println("--- Klub nakon uklanjanja igraca ---");
        System.out.print(klub);
    }
}