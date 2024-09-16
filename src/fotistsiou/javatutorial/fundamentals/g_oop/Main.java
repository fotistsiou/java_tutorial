package fotistsiou.javatutorial.fundamentals.g_oop;

public class Main {
    public static void main(String[] args) {
        /* "Professor" Instances/Objects */

        // Creation of instance/object through constructor with direct assign values on the attributes
        Professor professor = new Professor(
            "Efthimios Alepis",
            "Prof0001",
            "OOP"
        );
        // Call methods of instance/object
        professor.announce(); // Overridden Abstract Method
        professor.teach(); // Final Method


        /* "Student" Instances/Objects */

        // 1st "Student" instance/object
        // Creation of instance/object through "default "constructor
        Student student = new Student();
        // Assign values on the attributes after creation of instance/object
        student.setName("Fotios Tsioumas");
        student.setStudNumber("Stud21079");
        // student.setStudNumber("Prof21079"); // It will cause an exit with code 124
        // Call methods of instance/object
        student.announce(); // Overridden Abstract Method
        student.examResult(professor.getCourse(), 9.8f);
        Student.semester(1); // Static Method
        // 2nd "Student" instance/object
        Student student2 = new Student();
        student2.setName("Aspa Sideri");
        student2.setStudNumber("Stud21080");
        student2.announce(); // Overridden Abstract Method
        student2.examResult(professor.getCourse(), 10f);
        Student.semester(3); // Static Method
    }
}
