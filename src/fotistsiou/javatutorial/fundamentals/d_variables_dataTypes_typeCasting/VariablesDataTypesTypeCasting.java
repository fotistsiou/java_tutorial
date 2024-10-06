package fotistsiou.javatutorial.fundamentals.d_variables_dataTypes_typeCasting;

import java.util.Scanner;

public class VariablesDataTypesTypeCasting {

    public static void main(String[] args) {
        /* Variables */

        // To create a variable, you must specify the type and assign it a value
        // To declare more than one variable of the same type, you can use a comma-separated list
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


        /* Java Data Types */

        // Data types are divided into two groups:
        // Primitive Data Types: byte, short, int, long, float, double, boolean and char
        // Examples: hoursInADay, favNum, myGrade, pi, isTheSkyBlue, myLetter
        // Reference Data Types:  Arrays, Strings, Wrapper Classes, Classes, Interface etc
        // Examples: favNum, languageName, version


        /* Type Casting */

        // In Java, there are two types of casting:
        // 1.Widening Casting (automatically) - converting a smaller type to a larger type size
        //   byte -> short -> char -> int -> long -> float -> double
        // 2.Narrowing Casting (manually) - converting a larger type to a smaller size type
        //   double -> float -> long -> int -> char -> short -> byte
        // Examples:
        int myInt1 = 9;
        float myFloat1 = myInt1; // Automatic casting: int to float
        float myFloat2 = 9.78f;
        int myInt2 = (int) myFloat2; // Manual casting: float to int
        System.out.println(myInt1);
        System.out.println(myFloat1);
        System.out.println(myInt2);
        System.out.println(myFloat2);

        // Casting using primitive & reference types
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number:");
        String s6 = scanner.next();
        System.out.println("Please give another number:");
        String s7 = scanner.next();
        String sum = s6+s7;
        System.out.println("Concatenate Sum is: "+sum); // -> concatenate strings
        System.out.println("Please give a number:");
        String s8 = scanner.next();
        System.out.println("Please give another number:");
        String s9 = scanner.next();
        int firstNumber = Integer.parseInt(s8); // -> string to int
        int secondNumber = Integer.parseInt(s9); // -> string to int
        int sum2 = firstNumber+secondNumber;
        System.out.println("Arithmetic sum is: "+sum2); // -> arithmetic sum
        scanner.close();
    }
}
