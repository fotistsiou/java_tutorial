package fotistsiou.javatutorial.fundamentals.g_oop;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Efthimios Alepis";
        professor.type = "Professor";
        professor.profNumber = "Prof0001";
        professor.course = "OOP";
        professor.announce();
        professor.teach();

        Student student = new Student();
        student.name = "Fotios Tsioumas";
        student.type = "Student";
        student.studNumber = "Stud21079";
        student.announce();
        student.examResult(professor.course, 10f);
    }
}
