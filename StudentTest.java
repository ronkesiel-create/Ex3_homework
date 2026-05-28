package StudentClasses;

import java.util.Arrays;

public class StudentTest {
    /**
     * prints the given  students array in sorted order
     * @param array the given array
     * @throws NullPointerException if array given is null
     * @throws ArrayIndexOutOfBoundsException if array given is empty
     */
    public static  void printArray(Student[] array) {
        if (array == null) {
            throw new NullPointerException("array is null");
        }
        if (array.length == 0) {
            throw new ArrayIndexOutOfBoundsException("array is empty");
        }
        for (Student student : array) {
            System.out.println(student.toString());
        }
    }

    /**
     * This main function takes an array of 5 students.
     * It sorts them by grade, last name , and name length(the length of first and last name combined)
     * It also prints them in order they were sorted by
     * @param args
     */
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student(999999,"John","Levi",80.1);
        students[1] = new Student(222222,"Ron","Cohen",78.8);
        students[2] = new Student(666666,"Karl","Levi",79.8);
        students[3] = new Student(444444,"Ronit","Levi",80.1);
        students[4] = new Student(555555,"Avi","Cohen",78.8);
        Arrays.sort(students); // sorting by student ID


        System.out.println();
        System.out.println("Sorted array by grade in ascending order");
        System.out.println();
        Arrays.sort(students,new CompareByGrade());// sorting by  student's grade in ascending order
        printArray(students);
        System.out.println();
        System.out.println("Sorted array by Last Name in descending order");
        System.out.println();
        Arrays.sort(students,new CompareByLastName());// sorting by  student's Last Name in descending order
        printArray(students);
        System.out.println();
        System.out.println("Sorted array by Name Length in ascending order");
        System.out.println();
        Arrays.sort(students,new CompareByNameLength());// sorting by student's first and Last Name Length in ascending order
        printArray(students);
    }
}
