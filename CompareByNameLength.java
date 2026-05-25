import java.util.Comparator;

public class CompareByNameLength  implements Comparator<Student> {
    /**
     This method compares 2 students by their combined first name and last name length in ascending order
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return 0 if equal, 1 if "o1"'s is greater, -1 otherwise
     */
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 ==null ||  o2 == null) {
            throw new NullPointerException("One of the arguments is null");
        }
        int length1 =o1.getFirstName().length()+o1.getLastName().length();
        int length2 =o2.getFirstName().length()+o2.getLastName().length();
        if ( length1==length2) {
            return 0;
        }
        else if (length1>length2) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
