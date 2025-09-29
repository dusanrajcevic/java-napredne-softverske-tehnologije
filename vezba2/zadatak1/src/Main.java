import festival.Festival;

void main() {
    Festival f = new Festival("Exit", LocalDate.of(2025, 12, 31));
    f.dodajNastup("Parni Valjak", 90);
    f.dodajNastup("Dubioza Kolektiv", 75);
    f.dodajNastup("Riblja Corba", 80);

    System.out.println("---Pre sortiranja:---");
    System.out.println(f);

    System.out.println("\n\n---Nakon sortiranja po trajanju:---");
    f.sortirajNastupePoTrajanju();
    System.out.println(f);
    System.out.println(f.prikaziRaspored(20, 0, 10));
}