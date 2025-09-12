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
        Student s1 = new Student("A", "M", "0101995123456", "I001", 8.5);
        Student s2 = new Student("B", "M", "0101995123456", "I002", 9.2);
        Student s3 = new Student("C", "M", "0101995123456", "I003", 7.8);
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);

        Collections.sort(studenti);

        assertEquals(s3, studenti.get(0));
        assertEquals(s1, studenti.get(1));
        assertEquals(s2, studenti.get(2));
    }
}
