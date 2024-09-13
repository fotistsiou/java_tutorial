package fotistsiou.javatutorial.fundamentals.g_oop;

public class Student extends Academic {
    // Attributes
    private String studNumber;

    // Constructor 1
    public Student() {}

    // Constructor 2
    public Student(
        String name,
        String type,
        String studNumber
    ){
        super(name, type);
        // Assign value within setter
        this.setStudNumber(studNumber);
    }

    // Getters & Setters
    public String getStudNumber() {
        return studNumber;
    }
    // Setter with validation
    public void setStudNumber(String studNumber) {
        if (studNumber.startsWith("Stud")) {
            this.studNumber = studNumber;
        } else {
            System.out.println("The Student Number is incorrect.");
            System.exit(124);
        }
    }

    // Overridden Academic Abstract Method
    public void announce() {
        System.out.print("The " + this.getType() + " " + this.getName() + " ");
    }

    // Student Method
    void examResult (String course, float grade) {
        System.out.println("has Student Number " + this.getStudNumber() + " and has " + grade + " in " + course + ".");
    }
}
