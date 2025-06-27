package fotistsiou.javatutorial.b_fundamental_topics.h_methods.problems;

import java.util.Scanner;

public class HeronTriangleArea {
    private final double a, b, c;

    // Constructor to initialize the sides of the triangle
    public HeronTriangleArea(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to calculate the area using Heron's formula
    // Heron's formula states that the area of a triangle can be calculated
    // using its semi-perimeter (s) and the lengths of its sides (a, b, c).
    // The formula is derived as follows:
    // 1. Compute the semi-perimeter s = (a + b + c) / 2
    // 2. The area A is given by the formula:
    //    A = sqrt(s * (s - a) * (s - b) * (s - c))
    // 3. This formula works for any triangle as long as the given sides form a valid triangle.
    // 4. The square root ensures that the computed area is always a positive real number.
    double getArea() {
        double s = (a + b + c) / 2; // Compute the semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Apply Heron's formula
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the sides of the triangle
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        HeronTriangleArea triangle = new HeronTriangleArea(a, b, c);

        System.out.println("Area: " + triangle.getArea());

        scanner.close();
    }
}
