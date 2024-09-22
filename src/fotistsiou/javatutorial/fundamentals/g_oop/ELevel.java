package fotistsiou.javatutorial.fundamentals.g_oop;

/* Enums */
// -> An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
// -> An enum:
//    - Can have attributes and methods.
//    - Can implement interfaces.
//    - Cannot be used to create objects.
//    - Cannot extend other classes.

// Enum Class
// To create an enum:
// -> Use the "enum" keyword.
// -> Separate the constants with a comma.
public enum ELevel {
    // Enum Constants
    // -> They should be in uppercase letters.
    // -> They are public, static and final (unchangeable - cannot be overridden).
    INSUFFICIENT,
    GOOD,
    VERY_GOOD,
    EXCELLENT
}
