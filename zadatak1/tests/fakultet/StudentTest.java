package fakultet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testKreiranjeStudenta() {
        Student s = new Student("Petar Petrovic", "M", "0101995123456", "I004-15/2025", 9.5);
        assertEquals("Petar Petrovic", s.getImePrezime());
        assertEquals("M", s.getPol());
        assertEquals("0101995123456", s.getJmbg());
        assertEquals("I004-15/2025", s.getBrojIndeksa());
        assertEquals(9.5, s.getProsek());
    }

    @Test
    public void testSetBrojIndeksa() {
        Student s = new Student("Marija Markovic", "Z", "0202905123456", "I001-15/2025", 8.0);
        s.setBrojIndeksa("I004-99/2025");
        assertEquals("I004-99/2025", s.getBrojIndeksa());
    }

    @Test
    public void testSetProsek() {
        Student s = new Student("Marija Markovic", "Z", "0202995123456", "I001-15/2025", 8.0);
        s.setProsek(9.0);
        assertEquals(9.0, s.getProsek());
    }

    @Test
    public void testToStringFormat() {
        Student s = new Student("Petar Petrovic", "M", "0101995123456", "I004-15/2025", 9.5);
        String expected = "Petar Petrovic (" + s.getGodine() + ") - I004-15/2025 [9.5]";
        assertEquals(expected, s.toString());
    }

    @Test
    public void testSortiranjePoProsekuNeopadajuce() {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("A", "M", "0101995123456", "I001", 8.5));
        studenti.add(new Student("B", "M", "0101995123456", "I002", 9.2));
        studenti.add(new Student("C", "M", "0101995123456", "I003", 7.8));

        Collections.sort(studenti);

        assertEquals("C", studenti.get(0).getImePrezime());
        assertEquals("A", studenti.get(1).getImePrezime());
        assertEquals("B", studenti.get(2).getImePrezime());
    }
}
