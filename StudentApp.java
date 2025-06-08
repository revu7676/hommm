public class StudentApp {
    public static void main(String[] args) {
        // Hardcoded student details (no Scanner)
        String name = "Revathi";
        int age = 20;
        String studentId = "S12345";

        // Create Student object
        Student student = new Student(name, age, studentId);

        // Display student details
        System.out.println("--- Student Details ---");
        student.displayDetails();
    }
}

class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}


