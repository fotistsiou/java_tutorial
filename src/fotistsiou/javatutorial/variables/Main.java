package fotistsiou.javatutorial.variables;

public class Main {
    public static void main(String[] args) {
        // Create variables for the following values and then print them to the console with the corresponding texts:
        // Hours in a day: 24
        // My M.Sc. grade is 9.39
        // Pi is close to 3.1416
        // Is the sky blue?: true
        // The first letter of my name is the F
        // The programming language we're learning is Java
        
        int hoursInADay = 24;
        float myGrade = 9.39f;
        double pi = 3.1416;
        boolean isTheSkyBlue = true;
        char myLetter = 'F';
        String languageName = "Java";

        System.out.println("Hours in a day: " + hoursInADay);
        System.out.println("My MSc grade is " + myGrade);
        System.out.println("Pi is close to " + pi);
        System.out.println("Is the sky blue?: " + isTheSkyBlue);
        System.out.println("The first letter of my name is the " + myLetter);
        System.out.print("The programming language we're learning is " + languageName);
    }
}
