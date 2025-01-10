# Records in Java

## What are Records?
Records are a special type of class introduced in Java 14 (preview) and made stable in Java 16. They provide a concise 
way to create immutable data objects, focusing on storing data rather than defining behavior.

## Key Features of Records
1. **Compact Syntax**: Automatically generate boilerplate code like constructors, `toString()`, `equals()`, and 
   `hashCode()`.
2. **Immutable Data**: Fields in a record are final, ensuring immutability.
3. **Readable**: Records make data structures easier to understand and maintain.

## Usage of Records
- Representing simple data transfer objects (DTOs).
- Modeling immutable data in applications.
- Reducing boilerplate code for value-based classes.

## Characteristics of Records
- Declared using the `record` keyword.
- Fields are implicitly `private` and `final`.
- Records cannot extend other classes (but can implement interfaces).
- Records are implicitly `final` and cannot be subclassed.

## Auto-Generated Methods in Records
When using records, several methods are auto-generated:
- A public **constructor**, with an argument for each field.
- Public **getter** methods, whose names match the name of the field.
- A **`toString`** method, that results in a string containing the name of the record, followed by the name of each 
  field and its corresponding value in square brackets.
- An **`equals`** method, that returns `true` if the supplied object is of the same type and the values of all of 
  its fields match.
- A **`hashCode`** method, that returns the same value for two record objects if all the field values match.

## Advantages of Records
- Simplifies creation of data-centric classes.
- Encourages immutability and cleaner code.
- Reduces the need for manually overriding methods like `equals()` and `hashCode()`.

Records are ideal for scenarios where the primary purpose of a class is to store and transfer immutable data.
