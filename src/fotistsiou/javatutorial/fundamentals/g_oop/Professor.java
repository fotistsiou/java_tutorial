package fotistsiou.javatutorial.fundamentals.g_oop;

public class Professor extends Academic {
    // Attributes
    private String profNumber;
    private String course;

    // Constructor 1
    // Use the 'super' keyword for assigning values to inherited attributes, when creating objects
    public Professor(
        String name,
        String type,
        String profNumber,
        String course
    ){
        super(name, type);
        // Assign value within setter
        this.setProfNumber(profNumber);
        // Direct assign value
        this.course = course;
    }

    // Getter & Setters
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

    // Overridden Academic Abstract Method
    @Override
    public void announce() {
        System.out.print("The " + this.getType() + " " + this.getName() + " ");
    }

    // Professor Method
    public void teach() {
        System.out.println("has Professor Number " + this.getProfNumber() + " and teach " + this.getCourse() + ".");
    }
}
