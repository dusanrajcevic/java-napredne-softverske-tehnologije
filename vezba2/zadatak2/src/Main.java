import konferencija.Konferencija;

void main() {
    Konferencija konf = new Konferencija("IT Trends", LocalDate.of(2025, 12, 5));
    konf.dodajPredavanje("Veštačka inteligencija", "Dr Marko Marković", 45);
    konf.dodajPredavanje("Sajber bezbednost", "Dr Petar Petrović", 50);
    konf.dodajPredavanje("Kvantno računarstvo", "Dr Ivana Ilić", 60);
    System.out.print(konf);
    System.out.println(konf.ispisiAgendu(10, 0, 0));
}