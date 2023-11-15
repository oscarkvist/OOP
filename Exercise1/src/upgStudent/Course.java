package upgStudent;


public class Course {
    private final String courseCode;
    private final String courseName;
    private final Student[] enrolledStudents;
    private int numEnrolledStudents;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        enrolledStudents = new Student[100];
        numEnrolledStudents = 0;
    }

    public void getCourseInfo() {
        System.out.println("-" + courseCode + ": " + courseName);
    }


    public void enrollStudent(Student student) {
        if (enrolledStudents.length > numEnrolledStudents) {
            enrolledStudents[numEnrolledStudents] = student;
            numEnrolledStudents++;
        } else {
            System.out.println("Can't enroll more students");
        }
    }

    public void removeStudent(Student student) {
        int index = -1;
        for (int i = 0; i < numEnrolledStudents; i++) {
            if (enrolledStudents[i] == student) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numEnrolledStudents - 1; i++) {
                enrolledStudents[i] = enrolledStudents[i + 1];
            }
            enrolledStudents[numEnrolledStudents - 1] = null;
            numEnrolledStudents--;
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseCode);
        System.out.println("Course name: " + courseName);
        System.out.println("Course code: " + courseCode);
        System.out.println("Enrolled students: ");
        for (int i = 0; i < numEnrolledStudents; i++) {
            System.out.println("-" + enrolledStudents[i].getName());

        }
        System.out.println();
    }
}
