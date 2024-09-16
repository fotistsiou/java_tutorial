package fotistsiou.javatutorial.fundamentals.g_oop;

/* Classes */

// Class Inheritance
// -> Subclass "Professor" inherits from superclass "Academic"
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
        System.out.print("The " + Professor.type + " " + this.getName() + " of " + Academic.university + ", ");
    }
    // Final Method
    // -> Cannot be overridden by subclass.
    final void teach() {
        System.out.println("has Professor Number " + this.getProfNumber() + " and teach " + this.getCourse() + ".");
    }
}
