import fakultet.Fakultet;
import osoba.Osoba;

void main() {
    Osoba dekan = new Osoba("Pera Peric", "M", "1209975123456");
    Fakultet f = new Fakultet("Fakultet za Javu", dekan);

    fakultet.Student s1 = new fakultet.Student("Petar Petrovic", "M", "0101995123456", "I004-15/2025", 9.5);
    fakultet.Student s2 = new fakultet.Student("Ana Anic", "Z", "0202985123456", "I001-15/2025", 8.0);
    fakultet.Student s3 = new fakultet.Student("Marko Markovic", "M", "0303995123456", "I002-15/2025", 7.2);
    fakultet.Student s4 = new fakultet.Student("Jelena Jelic", "Z", "0404995123456", "I003-15/2025", 9.0);

    f.upisiStudenta(s1).upisiStudenta(s2).upisiStudenta(s3).upisiStudenta(s4);

    IO.println("Fakultet (pre sortiranja):");
    IO.println(f);
    IO.println("-------------------------------");

    Collections.sort(f.getStudenti());
    IO.println("Fakultet (sortirani studenti po proseku):");
    IO.println(f);
    IO.println("-------------------------------");

    f.ispisiStudenta("I001-15/2025");
    f.ispisiStudenta("I002-15/2025");
    IO.println("Fakultet nakon uklanjanja studenata:");
    IO.println(f);
}