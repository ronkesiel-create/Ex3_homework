package StudentClasses;

/**
 * this class represents a student by 4 characteristics:  id , firstName,  lastName, grade
 *
 *
 */
public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private double grade;
    private int id;

    /**
     * The constructor of the class
     * @param id
     * @param firstName
     * @param lastName
     * @param grade
     * @throws if grade is not between 0 and 100
     */
    public Student(int id,String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade = grade;
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getGrade() {
        return grade;
    }
    public int getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param grade the grade given
     * * @throws if grade is not between 0 and 100
     */
    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade = grade;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "ID = " + id + ", FirstName = " + firstName + ", LastName = " + lastName + ", Grade = " + grade ;
    }

    /**
     * This method compares between 2 students by their ID
     * @param other the object to be compared.
     * @return 0 if equal, 1 if "this" is greater, -1 otherwise
     */
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}
