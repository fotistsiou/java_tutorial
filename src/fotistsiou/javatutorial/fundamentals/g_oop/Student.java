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
        this.studNumber = studNumber;
    }

    // Getters & Setters
    public String getStudNumber() {
        return studNumber;
    }
    public void setStudNumber(String studNumber) {
        this.studNumber = studNumber;
    }

    // Overridden Academic Abstract Method
    public void announce() {
        System.out.print("The " + this.getType() + " " + this.getName() + " ");
    }

    // Student Method
    void examResult (String course, float grade) {
        System.out.println("has profNumber " + studNumber + " and has " + grade + " in " + course + ".");
    }
}
