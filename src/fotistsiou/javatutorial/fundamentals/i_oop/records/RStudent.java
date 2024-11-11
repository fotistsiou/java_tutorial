package fotistsiou.javatutorial.fundamentals.i_oop.records;

/**
 * Records
 * -> Records are immutable data classes that require only the type and name of fields.
 * -> Using records, they are auto-generated:
 *    - A public "constructor", with an argument for each field.
 *    - Public "getters" methods, whose names match the name of our field.
 *    - A "toString" method, that results in a string containing the name of the record,
 *      followed by the name of each field and its corresponding value in square brackets.
 *    - An "equals" method , that returns true if the supplied object is of the same type
 *      and the values of all of its fields match.
 *    - A "hashCode" method, that returns the same value for two Person objects
 *      if all the field values for both objects match.
 */

public record RStudent(
    String name,
    String studNumber
){}
