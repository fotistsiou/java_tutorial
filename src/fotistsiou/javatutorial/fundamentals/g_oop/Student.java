package fotistsiou.javatutorial.fundamentals.g_oop;

public class Student extends Academic {
    String studNumber;

    public Student() {}

    public Student(
        String name,
        String type,
        String studNumber
    ){
        super(name, type);
        this.studNumber = studNumber;
    }

    public String getStudNumber() {
        return studNumber;
    }

    public void setStudNumber(String studNumber) {
        this.studNumber = studNumber;
    }

    void examResult (String course, float grade) {
        System.out.println("Has profNumber " + studNumber + " and has " + grade + " in " + course + ".");
    }
}
