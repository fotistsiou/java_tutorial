package fotistsiou.javatutorial.fundamentals.h_oop.records;

public class Main {

    public static void main(String[] args) {
        // Create records objects
        RStudent rStudent1 = new RStudent("Rafailia Tsiouma", "Stud0004");
        RStudent rStudent2 = new RStudent("Christina Sideri", "Stud0005");

        // Use the auto-generated "toString" method
        System.out.println("I am a 'RStudent' record object -> " + rStudent1.toString());
        System.out.println("I am a 'RStudent' record object -> " + rStudent2.toString());

        // Use the auto-generated "equals" method
        if (rStudent1.equals(rStudent2)) {
            System.out.println("The 'RStudent' record objects are the same.");
        } else {
            System.out.println("The 'RStudent' record objects are different.");
        }

        // Use the auto-generated "hashCode" method
        if (rStudent1.hashCode() == rStudent2.hashCode()) {
            System.out.println("The 'RStudent' record objects are the same.");
        } else {
            System.out.println("The 'RStudent' record objects are different.");
        }
    }
}
