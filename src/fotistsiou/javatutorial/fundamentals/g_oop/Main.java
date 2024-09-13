package fotistsiou.javatutorial.fundamentals.g_oop;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor(
                "Efthimios Alepis",
                "professor",
                "Prof0001",
                "OOP"
        );
        professor.announce();
        professor.teach();

        Student student = new Student();
        student.setName("Fotios Tsioumas");
        student.setType("student");
        student.setStudNumber("Stud21079");
        // Process will finish with exit code 124
        // student.setStudNumber("Prof21079");
        student.announce();
        student.examResult(professor.getCourse(), 9.8f);
    }
}
