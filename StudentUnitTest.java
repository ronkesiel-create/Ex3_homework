package StudentClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentUnitTest {

    @Test
    void getFirstName() {

    }

    @Test
    void getLastName() {

    }

    @Test
    void getGrade() {

    }

    @Test
    void getId() {

    }

    @Test
    void setFirstName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void setGrade() {
    }

    @Test
    void setId() {

    }

    @Test
    void testToString() {
        Student student1 = new Student(40044678,"Dan","Cohen",78.8);
        System.out.println(student1.toString());
    }

    @Test
    void compareTo() {
        Student student1 = new Student(90044679,"Dan","Cohen",78.8);
        Student student2 = new Student(80044688,"Dana","Levi",79.8);
        Student student3 = new Student(70054647,"Dani","Cohen",80.1);
        assertEquals(1, student1.compareTo(student2));
        assertEquals(-1, student3.compareTo(student1));
        assertEquals(0, student2.compareTo(student2));

    }
}