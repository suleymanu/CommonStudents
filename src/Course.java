import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Course class
 * @author Suleyman Uslu
 */
public class Course {

    /** MEMBERS **/

    Map<String,Student> studentMap = new HashMap<>();

    /** CONSTRUCTORS **/

    Course(Student[] students) {
        for(Student student : students) {
            studentMap.put(student.getUniqueString(),student);
        }
    }

    /** METHODS **/

    int getSize() {
        return studentMap.size();
    }

    /**
     * Prints attendees of the course
     */
    void printAttendees() {
        for(Student student : studentMap.values()) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + student.getAge());
        }
    }

    /**
     * Generates a unique string for each student by concatenating name, surname, and age
     * @return  name, surname, and age concatenated as string
     */
    Set<String> getStudentUniqueStrings() {
        return studentMap.keySet();
    }

    boolean isStudentAttending(Student student) {
        return studentMap.containsKey(student.getUniqueString());
    }

    /**
     * Checks if a Student is attending a course
     * @param studentUniqueString   unique string of student
     * @return                      true if she is taking the course
     */
    boolean isStudentAttending(String studentUniqueString) {
        return studentMap.containsKey(studentUniqueString);
    }

    /** GETTERS AND SETTERS **/

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }
}
