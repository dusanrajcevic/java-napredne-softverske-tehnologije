import oblici.*;

void main() {
    Bure bure1 = new Bure(10, 20);
    Bure bure2 = new Bure(12, 18);
    Kutija kutija1 = new Kutija(5, 6, 7);
    Kutija kutija2 = new Kutija(8, 9, 10);
    Magacin magacin = new Magacin(2500);

    try {
        magacin.dodajKontejner(bure1)
                .dodajKontejner(bure2)
                .dodajKontejner(kutija1)
                .dodajKontejner(kutija2);
    } catch (IllegalStateException e) {
        System.out.println(e.getMessage());
    }

    Bure burePreveliko = new Bure(100, 100);
    try {
        magacin.dodajKontejner(burePreveliko);
    } catch (IllegalStateException e) {
        System.out.println(e.getMessage());
    }

    System.out.println("Magacin (pre uklanjanja):");
    System.out.println(magacin);
    try {
        magacin.ukloniKontejner(bure1.getId());
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    try {
        magacin.ukloniKontejner(-1);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }


    System.out.println("Magacin (nakon uklanjanja):");
    System.out.println(magacin);

    magacin.sortirajKontejnerePoPovrsiniNerastuce();
    System.out.println("Magacin (nakon sortiranja):");
    System.out.println(magacin);
}