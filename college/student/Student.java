package college.student;  // package declaration

public class Student {
    private String name;
    private int rollNo;

    // Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}
