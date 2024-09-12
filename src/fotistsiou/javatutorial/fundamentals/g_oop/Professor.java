package fotistsiou.javatutorial.fundamentals.g_oop;

public class Professor extends Academic {
    private String profNumber;
    private String course;

    public Professor(
        String name,
        String type,
        String profNumber,
        String course
    ){
        super(name, type);
        this.profNumber = profNumber;
        this.course = course;
    }

    public String getProfNumber() {
        return profNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setProfNumber(String profNumber) {
        this.profNumber = profNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    void teach() {
        System.out.println("Has profNumber " + profNumber + " and teach " + course + ".");
    }
}
