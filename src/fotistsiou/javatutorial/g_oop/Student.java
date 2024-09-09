package fotistsiou.javatutorial.g_oop;

public class Student extends Academic {
    String studNumber;

    void examResult (String course, float grade) {
        System.out.println("Has profNumber " + studNumber + " and has " + grade + " in " + course + ".");
    }
}
