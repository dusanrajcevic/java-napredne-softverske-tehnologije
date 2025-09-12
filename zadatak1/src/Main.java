import fakultet.Fakultet;
import osoba.Osoba;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Osoba dekan = new Osoba("Pera Peric", "M", "1209975123456");
        Fakultet f = new Fakultet("Fakultet za Javu", dekan);

        fakultet.Student s1 = new fakultet.Student("Petar Petrovic", "M", "0101995123456", "I004-15/2025", 9.5);
        fakultet.Student s2 = new fakultet.Student("Ana Anic", "Z", "0202985123456", "I001-15/2025", 8.0);
        fakultet.Student s3 = new fakultet.Student("Marko Markovic", "M", "0303995123456", "I002-15/2025", 7.2);
        fakultet.Student s4 = new fakultet.Student("Jelena Jelic", "Z", "0404995123456", "I003-15/2025", 9.0);

        f.upisiStudenta(s1);
        f.upisiStudenta(s2);
        f.upisiStudenta(s3);
        f.upisiStudenta(s4);

        System.out.println("Fakultet (pre sortiranja):");
        System.out.println(f);
        System.out.println("-------------------------------");

        Collections.sort(f.getStudenti());
        System.out.println("Fakultet (sortirani studenti po proseku):");
        System.out.println(f);
        System.out.println("-------------------------------");

        f.ispisiStudenta("I001-15/2025");
        f.ispisiStudenta("I002-15/2025");
        System.out.println("Fakultet nakon uklanjanja studenata:");
        System.out.println(f);
    }
}