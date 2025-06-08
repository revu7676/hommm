public class StudentCourse {
    private String courseName;
    private int durationInMonths;
    private String instructor;

    public StudentCourse(String courseName, int durationInMonths, String instructor) {
        this.courseName = courseName;
        this.durationInMonths = durationInMonths;
        this.instructor = instructor;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + durationInMonths + " months");
        System.out.println("Instructor: " + instructor);
    }
}

