package fotistsiou.javatutorial.fundamentals.j_oop.enums;

/**
 * Enums
 * -> An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
 * -> An enum:
 *    - Can have attributes and methods.
 *    - Can implement interfaces.
 *    - Cannot be used to create objects.
 *    - Cannot extend other classes.
 * -> To create an enum:
 *    - Use the "enum" keyword.
 *    - Separate the constants with a comma.
 * -> Enum Constants
 *   - They should be in uppercase letters.
 *   - They are public, static and final (unchangeable - cannot be overridden).
 */

// Enum Class
public enum ELevel {
    // Enum Constants
    INSUFFICIENT,
    GOOD,
    VERY_GOOD,
    EXCELLENT
}
