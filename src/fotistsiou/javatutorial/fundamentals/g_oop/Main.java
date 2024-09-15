package fotistsiou.javatutorial.fundamentals.g_oop;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor(
                "Efthimios Alepis",
                "Prof0001",
                "OOP"
        );
        professor.announce();
        professor.teach();

        Student student = new Student();
        student.setName("Fotios Tsioumas");
        student.setStudNumber("Stud21079");
        // student.setStudNumber("Prof21079"); // It will cause an exit with code 124
        student.announce();
        student.examResult(professor.getCourse(), 9.8f);
    }
}
