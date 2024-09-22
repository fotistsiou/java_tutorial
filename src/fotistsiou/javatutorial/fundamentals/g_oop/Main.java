package fotistsiou.javatutorial.fundamentals.g_oop;

import java.lang.reflect.Method;

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
        Student student1 = new Student();
        // Assign values on the attributes after creation of instance/object
        student1.setName("Fotios Tsioumas");
        student1.setStudNumber("Stud0001");
        // student.setStudNumber("Prof21079"); // It will cause an exit with code 124
        // Call methods of instance/object
        student1.announce(); // Overridden Abstract Method
        student1.examResult(professor.getCourse(), 9.8f);
        Student.semester(1); // Static Method
        // 2nd "Student" instance/object
        Student student2 = new Student();
        student2.setName("Aspa Sideri");
        student2.setStudNumber("Stud0002");
        student2.announce(); // Overridden Abstract Method
        student2.examResult(professor.getCourse(), 10f);
        Student.semester(3); // Static Method


        /* "Professor" accepts "Students" */

        // -> The "Student" class implements the "IProfessorContract" interface,
        // -> so the "Student" object can be passed as an argument to the "acceptInCourse" method.
        professor.acceptInCourse(student1);
        professor.acceptInCourse(student2);


        /* "Student" record */

        // Create records objects
        RStudent rStudent1 = new RStudent("Rafailia Tsiouma", "Stud0004");
        RStudent rStudent2 = new RStudent("Christina Sideri", "Stud0005");
        // Use the auto-generated "toString" method
        System.out.println("I am a 'RStudent' record object -> " + rStudent1.toString());
        System.out.println("I am a 'RStudent' record object -> " + rStudent2.toString());
        // Use the auto-generated "equals" method
        if (rStudent1.equals(rStudent2)) {
            System.out.println("The 'RStudent' record objects are the same.");
        } else {
            System.out.println("The 'RStudent' record objects are different.");
        }
        // Use the auto-generated "hashCode" method
        if (rStudent1.hashCode() == rStudent2.hashCode()) {
           System.out.println("The 'RStudent' record objects are the same.");
        } else {
           System.out.println("The 'RStudent' record objects are different.");
        }


        /* "AGreeting" annotation */

        // Use the custom annotation
        class Greeding {
            // Customized Values
            @AGreeting(value = "Hello Everyone", priority = 1)
            public void greet() {
                System.out.println("This method is annotated with AGreeting annotation with customized values.");
            }
            // Default Values
            @AGreeting
            public void greetAgain() {
                System.out.println("This method is annotated with AGreeting annotation with default values.");
            }
        }

        // You can access the annotations applied to methods using reflection.
        // -> Create a Greeting object
        Greeding greeding = new Greeding();
        // -> Get all methods of the Greeting class
        Method[] methods = greeding.getClass().getDeclaredMethods();
        // -> Iterate through all methods to check if they are annotated with AGreeting
        int index = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(AGreeting.class)) {
                AGreeting annotation = method.getAnnotation(AGreeting.class);
                System.out.println("AGreeting Annotated Method " + index + ":");
                System.out.println("Method -> " + method.getName());
                System.out.println("Value -> " + annotation.value());
                System.out.println("Priority -> " + annotation.priority());
            }
            index++;
        }
    }
}
