import java.util.Set;

/**
 * Finds common students between two courses
 * TODO - faster algorithm
 * @author Suleyman Uslu
 */
public class CommonStudentFinder {

    /**
     * Finds students who are attending both courses
     * @param students1 students attending first course
     * @param students2 students attending second course
     * @return          number of students attending both courses
     */
    static int findStudentsWithCommonCourse(Student[] students1, Student[] students2) {

        Course course1, course2;

        if(students1.length < students2.length) {
            course1 = new Course(students1);
            course2 = new Course(students2);
        }
        else {
            course1 = new Course(students2);
            course2 = new Course(students1);
        }

        int commonStudents = 0;

        Set<String> studentUniqueStrings = course1.getStudentUniqueStrings();

        for(String studentUniqueString : studentUniqueStrings) {

            if( course2.isStudentAttending(studentUniqueString) )
                commonStudents++;
        }

        return commonStudents;
    }
}
