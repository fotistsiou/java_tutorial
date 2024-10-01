package fotistsiou.javatutorial.fundamentals.h_oop;

/* Classes */
// -> There are "blueprints" for creating instances/objects.

// Class Inheritance
// -> "Professor" class extends "Academic" abstract class
public class Professor extends Academic {
    /* Attributes */

    // "static" non-access modifier
    // -> Defines attributes that belongs to the class.
    static String type = "professor";
    private String profNumber;
    private String course;


    /* Constructors */

    // Constructor 1
    // -> Use the 'super' keyword for assigning values to inherited attributes, when creating an instance/object
    public Professor(
        String name,
        String profNumber,
        String course
    ){
        super(name);
        this.setProfNumber(profNumber); // Assign value within setter
        this.course = course; // Direct assign value
    }


    /* Getters & Setters */

    public String getProfNumber() {
        return profNumber;
    }

    public String getCourse() {
        return course;
    }

    // Setter with validation
    public void setProfNumber(String profNumber) {
        if (profNumber.startsWith("Prof")) {
            this.profNumber = profNumber;
        } else {
            System.out.println("The Professor Number is incorrect.");
            System.exit(123);
        }
    }

    // Setter without validation
    public void setCourse(String course) {
        this.course = course;
    }


    /* Methods */

    // Overridden Abstract Method
    // -> A class that inherits from an abstract class must implement/override all of its abstract methods.
    @Override
    public void announce() {
        System.out.print("The " + Professor.type + " " + this.getName() + " of the " + Academic.university + ", ");
    }

    // Final Method
    // -> Cannot be overridden by subclass.
    final void teach() {
        System.out.println("has Professor Number " + this.getProfNumber() + " and teach " + this.getCourse() + ".");
    }

    // Method with parameter an Interface instance
    // -> With this way a "Professor" accepts "Students" who implement his contract "IProfessorContract".
    // -> When a professor calls this method passing an object as an argument,
    //    the object's class must implement the "IProfessorContract",
    //    so the object to be accepted
    void acceptInCourse(IProfessorContract accepted){
        accepted.speak("I can speak!");
        accepted.raiseHand("I can raise my hand!");
        accepted.lowerHand("I can lower my hand!");
    }
}
