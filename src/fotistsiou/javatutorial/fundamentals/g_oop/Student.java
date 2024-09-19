package fotistsiou.javatutorial.fundamentals.g_oop;

/* Classes */

// Class Inheritance & Interface Implementation
// -> "Student" class extends "Academic" abstract class
// -> "Student" implements "IProfessorContract" interface
public class Student extends Academic implements IProfessorContract {
    /* Attributes */

    private String studNumber;
    static String type = "student";


    /* Constructors */

    // Constructor 1
        public Student(){}
    // Constructor 2
    public Student(
        String name,
        String studNumber
    ){
        super(name);
        this.studNumber = studNumber;
    }


    /* Getters & Setters */

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


    /* Methods */

    public void announce() {
        System.out.println("The " + Student.type + " " + this.getName() + " of " + Academic.university + ".");
    }
    final void examResult (String course, float grade) {
        System.out.print("Student Number: " + this.getStudNumber() + ", Course: " + course + ", Grade: " + grade + ", ");
    }
    // Static Method
    // -> Belongs to the class.
    static void semester(int semester) {
        String semesterAdjective = String.valueOf(semester);
        switch (semester) {
            case 1:
                semesterAdjective += "st";
                break;
            case 2:
                semesterAdjective += "nd";
                break;
            case 3:
                semesterAdjective += "rd";
                break;
            default:
                semesterAdjective += "th";
        }
        System.out.println("Semester: " + semesterAdjective + ".");
    }

    // Overridden Interfaces Method
    @Override
    public void raiseHand(String raise) {
        System.out.println("I am the student " + this.getName() + " and " + raise);
    }
    @Override
    public void lowerHand(String lower) {
        System.out.println("I am the student " + this.getName() + " and " + lower);
    }
    @Override
    public void speak(String speak) {
        System.out.println("I am the student " + this.getName() + " and " + speak);
    }
}
