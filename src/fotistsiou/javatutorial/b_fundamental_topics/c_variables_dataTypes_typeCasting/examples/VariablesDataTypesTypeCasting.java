package fotistsiou.javatutorial.b_fundamental_topics.c_variables_dataTypes_typeCasting.examples;

import java.util.Scanner;

public class VariablesDataTypesTypeCasting {

    public static void main(String[] args) {
        // Variables
        int hoursInADay = 24;
        float myGrade = 9.39f;
        double pi = 3.1416;
        boolean isTheSkyBlue = true;
        char myLetter = 'F';
        String languageName = "Java";
        String version = System.getProperty("java.version"); // version of Java at runtime
        Integer favNum = 4; // Wrapper Class
        System.out.println("Hours in a day: " + hoursInADay);
        System.out.println("My MSc grade is " + myGrade);
        System.out.println("Pi is close to " + pi);
        System.out.println("Is the sky blue?: " + isTheSkyBlue);
        System.out.println("The first letter of my name is the " + myLetter);
        System.out.println("The programming language we're learning is " + languageName + ", version " + version);
        System.out.println("My favorite number: " + favNum);

        // Data Types
        // -> Primitive Data Types: hoursInADay, favNum, myGrade, pi, isTheSkyBlue, myLetter
        // -> Reference Data Types: favNum, languageName, version
        
        // Type Casting
        // -> Automatic casting
        int myInt1 = 9;
        float myFloat1 = myInt1; // int to float
        float myFloat2 = 9.78f;
        // -> Manual casting
        int myInt2 = (int) myFloat2; // float to int
        System.out.println(myInt1);
        System.out.println(myFloat1);
        System.out.println(myInt2);
        System.out.println(myFloat2);
        // -> Casting using primitive & reference types
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number:");
        String s6 = scanner.next();
        System.out.println("Please give another number:");
        String s7 = scanner.next();
        String sum = s6+s7;
        System.out.println("Concatenate Sum is: " + sum);
        System.out.println("Please give a number:");
        String s8 = scanner.next();
        System.out.println("Please give another number:");
        String s9 = scanner.next();
        int firstNumber = Integer.parseInt(s8); // string to int
        int secondNumber = Integer.parseInt(s9); // string to int
        int sum2 = firstNumber+secondNumber;
        System.out.println("Arithmetic sum is: " + sum2);
        scanner.close();
    }
}
