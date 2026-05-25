import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareByNameLengthTest {

    @Test
    void compare() {
        Student student1 = new Student(10044679,"Ron","Cohen",78.8);
        Student student2 = new Student(20044688,"Karl","Levi",79.8);
        Student student3 = new Student(30054647,"Ronita","Levi",80.1);
        CompareByNameLength compareByNameLength = new CompareByNameLength();
        assertEquals(0, compareByNameLength.compare(student1, student2));
        assertEquals(1,  compareByNameLength.compare(student3,student1));
        assertEquals(0,  compareByNameLength.compare(student2,student2));
        assertEquals(-1,  compareByNameLength.compare(student1,student3));
    }
}