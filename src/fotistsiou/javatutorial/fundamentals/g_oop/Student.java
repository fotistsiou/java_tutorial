package fotistsiou.javatutorial.fundamentals.g_oop;

public class Student extends Academic {
    // Attributes
    private String studNumber;
    static String type = "student";

    // Constructor 1
    public Student() {}

    // Constructor 2
    public Student(
        String name,
        String studNumber
    ){
        super(name);
        this.setStudNumber(studNumber);
    }

    // Getters & Setters
    public String getStudNumber() {
        return studNumber;
    }
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
        System.out.print("The " + Student.type + " " + this.getName() + " of " + Academic.university + ", ");
    }

    // Student Method
    void examResult (String course, float grade) {
        System.out.println("has Student Number " + this.getStudNumber() + " and has " + grade + " in " + course + ".");
    }
}
