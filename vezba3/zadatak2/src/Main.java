import banka.*;

void main() {
    Banka<Double> nacionalna = new Banka<>("Nacionalna Banka");
    Banka<Object> univerzalna = new Banka<>("Univerzalna Banka");

    Klijent k1 = new Klijent("Marko", "Markovic");
    k1.dodajRacun(new Racun<>(2500.0));
    k1.dodajRacun(new Racun<>(1500.50));

    Klijent k2 = new Klijent("Jelena", "Jovanovic");
    k2.dodajRacun(new Racun<>(3000.0));

    Klijent k3 = new Klijent("Petar", "Petrovic");
    k3.dodajRacun(new Racun<>(1200));

    nacionalna.dodajKlijenta(k1);
    nacionalna.dodajKlijenta(k2);
    nacionalna.dodajKlijenta(k3);

    System.out.println("--- Pre prebacivanja klijenata ---");
    System.out.println("Nacionalna:");
    System.out.println(nacionalna);
    System.out.println("Univerzalna:");
    System.out.println(univerzalna);

    BankaUtil.prebaciKlijente(nacionalna, univerzalna);

    System.out.println("--- Posle prebacivanja klijenata ---");
    System.out.println("Nacionalna:");
    System.out.println(nacionalna);
    System.out.println("Univerzalna:");
    System.out.println(univerzalna);

    FinansijskaBanka<Double> fb = new FinansijskaBanka<>("Finansijska Banka");
    fb.dodajKlijenta(k1);
    fb.dodajKlijenta(k2);
    System.out.println("--- Finansijska banka ---");
    System.out.println(fb);
}
