package fotistsiou.javatutorial.fundamentals.j_oop;

import fotistsiou.javatutorial.fundamentals.j_oop.enums.ELevel;
import fotistsiou.javatutorial.fundamentals.j_oop.interfaces.IProfessorContract;

/**
 * Class Inheritance & Interface Implementation
 * -> "Student" class extends "Academic" abstract class
 * -> "Student" implements "IProfessorContract" interface
 */

public class Student extends Academic implements IProfessorContract {
    // Class Attributes
    // "private" access modifier
    private String studNumber;
    // "default" access modifier & "static" non-access modifier
    static String type = "student";

    // Class Constructor 1
    public Student(){}
    // Class Constructor 2
    public Student(
        String name,
        String studNumber
    ){
        super(name);
        this.studNumber = studNumber;
    }

    // Getters & Setters
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

    // Class Methods
    // -> Implement/Override Abstract Method
    @Override
    public void announce() {
        System.out.println("The " + Student.type + " " + this.getName() + " of the " + Academic.university + ":");
    }
    // -> Final Method
    final void examResult (String course, float grade) {
        // Use "Enum" variable
        ELevel verbalGrading;
        if (grade < 5) {
            verbalGrading = ELevel.INSUFFICIENT;
        } else if (grade >= 5 && grade <= 6.49) {
            verbalGrading = ELevel.GOOD;
        } else if (grade > 6.49 && grade <= 8.49) {
            verbalGrading = ELevel.VERY_GOOD;
        } else {
            verbalGrading = ELevel.EXCELLENT;
        }
        System.out.print(
            "Student Number: " + this.getStudNumber() + ", " +
            "Course: " + course + ", " +
            "Grade: " + grade + " (" + verbalGrading + "), "
        );
    }
    // -> Static Method
    static void semester(int semester) {
        String semesterAdjective = String.valueOf(semester);
        switch (semester) {
            case 1 -> semesterAdjective += "st";
            case 2 -> semesterAdjective += "nd";
            case 3 -> semesterAdjective += "rd";
            default -> semesterAdjective += "th";
        }
        System.out.println("Semester: " + semesterAdjective + ".");
    }
    // -> Overridden Interface Method
    @Override
    public void raiseHand(String raise) {
        System.out.println("I am the student " + this.getName() + " and " + raise);
    }
    // -> Overridden Interface Method
    @Override
    public void lowerHand(String lower) {
        System.out.println("I am the student " + this.getName() + " and " + lower);
    }
    // -> Overridden Interface Method
    @Override
    public void speak(String speak) {
        System.out.println("I am the student " + this.getName() + " and " + speak);
    }
}
