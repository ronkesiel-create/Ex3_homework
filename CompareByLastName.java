import java.util.Comparator;

public class CompareByLastName implements Comparator<Student> {
    /**
     *This method compares 2 students by their last name in alphabetical order
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return 0 if equal, 1 if "o1"'s is greater, -1 otherwise
     */
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0) return result;
        if (result >0) return 1;
        else return -1;
    }

}
