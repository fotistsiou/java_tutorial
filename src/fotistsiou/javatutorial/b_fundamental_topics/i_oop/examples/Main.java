package fotistsiou.javatutorial.b_fundamental_topics.i_oop.examples;

public class Main {

    public static void main(String[] args) {
        // "Professor" Instances/Objects
        // -> Creation of instance/object through constructor with direct assign values on the attributes
        Professor professor = new Professor(
            "Efthimios Alepis",
            "Prof0001",
            "OOP"
        );
        // -> Call methods of instance/object
        professor.announce(); // Overridden Abstract Method
        professor.teach(); // Final Method


        // "Student" Instances/Objects
        // -> 1st "Student" instance/object
        //    - Creation of instance/object through "default "constructor
        Student student1 = new Student();
        //    - Assign values on the attributes after creation of instance/object
        student1.setName("Fotios Tsioumas");
        student1.setStudNumber("Stud0001");
        // student.setStudNumber("Prof21079"); // It will cause an exit with code 124
        //     - Call methods of instance/object
        student1.announce(); // Overridden Abstract Method
        student1.examResult(professor.getCourse(), 9.8f);
        Student.semester(1); // Static Method
        // -> 2nd "Student" instance/object
        Student student2 = new Student();
        student2.setName("Aspa Sideri");
        student2.setStudNumber("Stud0002");
        student2.announce(); // Overridden Abstract Method
        student2.examResult(professor.getCourse(), 10f);
        Student.semester(3); // Static Method


        // -> "Professor" accepts objects that implements "IProfessorContract" interface.
        // -> The "Student" class implements the "IProfessorContract" interface, so the "Student" object can be passed
        //    as an argument to the "acceptInCourse" method.
        professor.acceptInCourse(student1);
        professor.acceptInCourse(student2);
    }
}
