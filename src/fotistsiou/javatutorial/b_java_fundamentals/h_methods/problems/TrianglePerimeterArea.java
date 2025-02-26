package fotistsiou.javatutorial.b_java_fundamentals.h_methods.problems;

import java.util.Scanner;

public class TrianglePerimeterArea {
    private final double a, b, c;

    // Constructor to initialize the sides of the triangle
    public TrianglePerimeterArea(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to calculate the perimeter of the triangle
    double getPerimeter() {
        return a + b + c;
    }

    // Method to calculate the area using Heron's formula
    // Heron's formula states that the area of a triangle can be calculated
    // using its semi-perimeter (s) and the lengths of its sides (a, b, c)
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Create a TriangleArea object with the given sides
        TrianglePerimeterArea triangle = new TrianglePerimeterArea(a, b, c);

        // Print the calculated perimeter and area
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());

        scanner.close();
    }
}

