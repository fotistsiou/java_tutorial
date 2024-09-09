package fotistsiou.javatutorial.g_oop;

public class Professor extends Academic {
    String profNumber;
    String course;

    void teach() {
        System.out.println("Has profNumber " + profNumber + " and teach " + course + ".");
    }
}
