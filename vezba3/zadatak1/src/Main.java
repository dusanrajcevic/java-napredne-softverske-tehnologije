import kolekcija.*;
import artikli.*;

void main() {
    Magacin<Knjiga> magacinKnjiga = new Magacin<>();
    magacinKnjiga.dodajKutiju(new Kutija<>(new Knjiga("Na Drini cuprija", "Ivo Andric")));
    magacinKnjiga.dodajKutiju(new Kutija<>(new Knjiga("Prokleta avlija", "Ivo Andric")));
    System.out.println("--- Magacin knjiga ---");
    System.out.println(magacinKnjiga);

    Magacin<Telefon> magacinTelefon = new Magacin<>();
    magacinTelefon.dodajKutiju(new Kutija<>(new Telefon("Samsung S24", 1200.0)));
    magacinTelefon.dodajKutiju(new Kutija<>(new Telefon("iPhone 15", 1500.0)));
    System.out.println("\n--- Magacin telefona ---");
    System.out.println(magacinKnjiga);

    NumerickiMagacin<Double> numerickiMagacin = new NumerickiMagacin<>();
    numerickiMagacin.dodajKutiju(new Kutija<>(42.0));
    numerickiMagacin.dodajKutiju(new Kutija<>(3.14));
    numerickiMagacin.dodajKutiju(new Kutija<>(7.0));
    System.out.println("\n--- Numericki magacin ---");
    System.out.println(numerickiMagacin);
    System.out.println("Zbir: " + numerickiMagacin.zbir());

    Magacin<Object> magacin = new Magacin<>();
    System.out.println("\n--- Prebacivanje sadrzaja iz magacina knjiga u magacin objekata ---");
    MagaciniUtil.prebaciSadrzaj(magacinKnjiga, magacin);
    System.out.println("Magacin knjiga nakon prebacivanja:");
    System.out.println(magacinKnjiga);
    System.out.println("Magacin objekata:");
    System.out.println(magacin);
}
