import college.student.Student;  // import Student class
import college.faculty.Faculty;  // import Faculty class

public class MainClass {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student("Bhavana", 101); 
        s1.displayStudentInfo();

        System.out.println(); // for spacing

        // Create Faculty object
        Faculty f1 = new Faculty("Rajiv Sir", "Computer Science"); 
        f1.displayFacultyInfo();
    }
}

