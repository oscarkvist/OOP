package upgStudent;

public class Student {
    private final String name;
    private final String studentId;
    private Course[] enrolledCourses;
    private int numEnrolledcourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        enrolledCourses = new Course[10];
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (enrolledCourses.length > numEnrolledcourses) {
            enrolledCourses[numEnrolledcourses] = course;
            numEnrolledcourses++;
            course.enrollStudent(this);
        }
    }

    public void dropCourse(Course course) {
        int index = -1;
        for (int i = 0; i < numEnrolledcourses; i++) {
            if (enrolledCourses[i] == course) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numEnrolledcourses - 1; i++) {
                enrolledCourses[i] = enrolledCourses[i + 1];
            }
            enrolledCourses[numEnrolledcourses - 1] = null;
            course.removeStudent(this);
            numEnrolledcourses--;
        }

    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name);
        System.out.println("Student id: " + studentId);
        System.out.println("Enrolled Courses: ");
        for (int i = 0; i < numEnrolledcourses; i++) {
            enrolledCourses[i].getCourseInfo();

        }
        System.out.println();
    }
}
