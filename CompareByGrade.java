package StudentClasses;

import java.util.Comparator;

public class CompareByGrade implements Comparator<Student> {


    /**
     * This method compares 2 students by grade
     * @param o1 the first student to be compared.
     * @param o2 the second student to be compared.
     * @return 0 if there are equal, 1 if "o1" has higher grade then "o2" , -1 otherwise
     * @throws NullPointerException if One of the given students is null
     */
    @Override
    public int compare(Student o1, Student o2) {

        if (o1 ==null ||  o2== null) {
            throw new NullPointerException("One of the arguments is null");
        }
        if (o1.getGrade() == o2.getGrade()) {
            return 0;
        }
        if (o1.getGrade() > o2.getGrade()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
