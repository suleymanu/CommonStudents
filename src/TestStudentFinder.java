import org.junit.Before;
import org.junit.Test;

/**
 * Test class for student finder
 * @author Suleyman Uslu
 */
public class TestStudentFinder {

    private Student[] students = new Student[10];

    @Before
    public void initStudents() {
        Application.initStudents(students);
    }

    @Test
    public void test1() {
        Student[] course1 = {students[0],students[1]};
        Student[] course2 = {students[1],students[2]};
        assert 1 == CommonStudentFinder.findStudentsWithCommonCourse(course1,course2);
    }

    @Test
    public void test2() {
        Student[] course1 = {students[0],students[1],students[2],students[3]};
        Student[] course2 = {students[1],students[2]};
        assert 2 == CommonStudentFinder.findStudentsWithCommonCourse(course1,course2);
    }

    @Test
    public void test3() {
        Student[] course1 = {students[0],students[1],students[2],students[3]};
        Student[] course2 = {};
        assert 0 == CommonStudentFinder.findStudentsWithCommonCourse(course1,course2);
    }

    @Test
    public void test4() {
        Student[] course1 = {};
        Student[] course2 = {students[1],students[2]};
        assert 0 == CommonStudentFinder.findStudentsWithCommonCourse(course1,course2);
    }

    @Test
    public void test5() {
        Student[] course1 = {students[0],students[1],students[2],students[3]};
        Student[] course2 = {students[0],students[1],students[2],students[3]};
        assert 4 == CommonStudentFinder.findStudentsWithCommonCourse(course1,course2);
    }

    @Test
    public void test6() {
        Student[] course1 = {students[3]};
        Student[] course2 = {students[0],students[1],students[2]};
        assert 0 == CommonStudentFinder.findStudentsWithCommonCourse(course1,course2);
    }
}
