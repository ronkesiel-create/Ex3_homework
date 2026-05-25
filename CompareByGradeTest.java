import static org.junit.jupiter.api.Assertions.*;

class CompareByGradeTest {

    @org.junit.jupiter.api.Test
    void compare() {
        Student student1 = new Student(10044679,"Avi","Cohen",78.8);
        Student student2 = new Student(20044688,"Karl","Levi",78.8);
        Student student3 = new Student(30054647,"John","Levi",80.1);
       CompareByGrade compareByGrade = new CompareByGrade();
       assertEquals(0,  compareByGrade.compare(student1,student2));
       assertEquals(0,  compareByGrade.compare(student2,student1));
       assertEquals(-1,  compareByGrade.compare(student1,student3));
       assertEquals(1,  compareByGrade.compare(student3,student1));
       assertEquals(1,  compareByGrade.compare(student3,student2));
       assertEquals(-1,  compareByGrade.compare(student2,student3));
    }
}