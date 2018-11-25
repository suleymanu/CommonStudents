/**
 * Application for Common Student Finder
 * (Several test cases can be found at test class)
 * @author Suleyman Uslu
 */
public class Application {

    private static Student[] students = new Student[10];

    static void initStudents(Student[] students) {
        students[0] = new Student("James", "Born", 23);
        students[1] = new Student("James", "Born", 24);
        students[2] = new Student("James", "Born", 25);
        students[3] = new Student("Jason", "Born", 23);
        students[4] = new Student("Jason", "Born", 24);
        students[5] = new Student("James", "Harden", 23);
        students[6] = new Student("James", "Harden", 24);
        students[7] = new Student("James", "Lebron", 23);
        students[8] = new Student("Lebron", "James", 23);
        students[9] = new Student("Lebron", "James", 24);
    }

    static void testOneCase(int[] c1, int[] c2) {

        Student[] list1 = new Student[c1.length];
        Student[] list2 = new Student[c2.length];

        for(int i=0; i<c1.length; i++)
            list1[i] = students[c1[i]];

        for(int i=0; i<c2.length; i++)
            list2[i] = students[c2[i]];

        Course course1 = new Course(list1);
        Course course2 = new Course(list2);

        System.out.println("Course 1 attendees:");
        course1.printAttendees();

        System.out.println("Course 2 attendees:");
        course2.printAttendees();

        int commonStudents = CommonStudentFinder.findStudentsWithCommonCourse(list1,list2);

        System.out.println("Common students: " + commonStudents + "\n");
    }

    public static void main(String[] args) {

        initStudents(students);

        testOneCase(new int[]{0,1}, new int[]{1,2});
        testOneCase(new int[]{0,1,2,3}, new int[]{1,2});
        testOneCase(new int[]{1,2}, new int[]{0,1,2,3});
        testOneCase(new int[]{2,4,6,8,0}, new int[]{1,3,5,7,9});
        testOneCase(new int[]{}, new int[]{1});
        testOneCase(new int[]{}, new int[]{});
        testOneCase(new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5});
    }
}
