import biblioteka.Biblioteka;
import knjiga.Knjiga;

void main() {
    Biblioteka biblioteka = new Biblioteka("Gradska biblioteka");
    biblioteka.dodajKnjigu(new Knjiga("Naslov 1", "Autor 1", 2001))
            .dodajKnjigu(new Knjiga("Naslov 2", "Autor 2", 1999))
            .dodajKnjigu(new Knjiga("Naslov 3", "Autor 3", 2010))
            .upisiClana(new biblioteka.Clan("Marko Markovic", "12345"))
            .upisiClana(new biblioteka.Clan("Jovan Jovanovic", "67890"))
            .upisiClana(new biblioteka.Clan("Ana Anic", "54321"));
    System.out.println("Biblioteka bez sortiranja:");
    System.out.println(biblioteka);
    System.out.println("Biblioteka sa sortiranim knjigama:");
    System.out.println(biblioteka.knjigePoGodiniIzdanjaString());
    biblioteka.ukloniKnjigu(2);
    biblioteka.izbrisiClana("67890");
    System.out.println("Biblioteka nakon uklanjanja knjige i clana:");
    System.out.println(biblioteka);
}
