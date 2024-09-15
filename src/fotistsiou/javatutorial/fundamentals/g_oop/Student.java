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

    // Getter & Setter
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

    // Override Abstract Method
    public void announce() {
        System.out.print("The " + Student.type + " " + this.getName() + " of " + Academic.university + ", ");
    }

    // Final Method
    final void examResult (String course, float grade) {
        System.out.print("has Student Number " + this.getStudNumber() + " and has " + grade + " in " + course + ", ");
    }

    // Static Method
    // Belongs to the class.
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
        System.out.println("in the " + semesterAdjective + " semester.");
    }
}
