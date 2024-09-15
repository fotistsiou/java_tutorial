package fotistsiou.javatutorial.fundamentals.g_oop;

public class Professor extends Academic {
    // Attributes
    private String profNumber;
    private String course;
    static String type = "professor"; // static variable belongs to the class and can be overridden/modified

    // Constructor 1
    // Use the 'super' keyword for assigning values to inherited attributes, when creating objects
    public Professor(
        String name,
        String profNumber,
        String course
    ){
        super(name);
        this.setProfNumber(profNumber); // Assign value within setter
        this.course = course; // Direct assign value
    }

    // Getters & Setters
    public String getProfNumber() {
        return profNumber;
    }
    public String getCourse() {
        return course;
    }
    public void setProfNumber(String profNumber) { // Setter with validation
        if (profNumber.startsWith("Prof")) {
            this.profNumber = profNumber;
        } else {
            System.out.println("The Professor Number is incorrect.");
            System.exit(123);
        }
    }
    public void setCourse(String course) { // Setter without validation
        this.course = course;
    }

    // Overridden Abstract Method
    @Override
    public void announce() {
        System.out.print("The " + Professor.type + " " + this.getName() + " of " + Academic.university + ", ");
    }

    // Final Method
    // Cannot be overridden by subclass.
    final void teach() {
        System.out.println("has Professor Number " + this.getProfNumber() + " and teach " + this.getCourse() + ".");
    }
}
