# Exception Handling

To handle exceptions gracefully and ensure the program continues to operate, three main techniques are used:

## **Try-Catch-Finally Block**

- **`try`**: Defines a block of code to test for exceptions.
- **`catch`**: Defines a block of code to handle the exception if it occurs in the `try` block.
- **`finally`**: Executes code regardless of whether an exception was thrown or caught (e.g., releasing resources).

## Throw Statement

- Used to explicitly create and throw exceptions during runtime.
- Must specify an exception type to throw.

## Using Control Statements

- **`if-else` statements**: Handle exceptions based on conditions.
    - Simple Condition (e.g. `if (b == 0)`)
    - RegEx (e.g. `if (input.matches("\\d+")`)

   