# Errors in programs

We will divide all possible errors into two groups: compile-time errors and run-time errors.

## Compile-time errors

Compile-time errors are errors that prevent a Java program from being compiled:
* a syntax error: an incorrect keyword, a forgotten ; symbol at the end of a statement
* a bad source code file name 
* invoking a non-existing method
* and many others

To avoid such errors, programmers use a modern IDE (Integrated Development Environment) with a static code analyzer. 
This tool allows programmers to identify compile-time errors before the compilation. 
In addition, it is able to highlight warnings about more complex errors and weak places in your code, 
as well as tips on how to improve the code.

## Run-time errors

Run-time errors (also known as "bugs") are errors that occur when the program is running. 
Run-time errors will cause your program to behave unexpectedly or may even stop the execution.
There are two subtypes of run-time errors:
* **logic errors** – when a program produces a wrong result because the code is not correct (for example, instead of "Hello!", your program outputs "Hi!")
* **unhandled exceptional events** like division by zero, not found files, and other unexpected cases

Avoiding such run-time errors is a more difficult task than avoiding compile-time errors. 
If your program compiles successfully, there are no guarantees that it does not have bugs. 
There are different strategies to find such errors:
* to debug your program
* to write automated tests for your program
* to use the practice of code review as part of the development process. 
  In general, this practice stands for a case, where one or more developers visually inspect the source code of a program.

## Exception Handling

Two techniques are used to handle exceptional events (exceptions):
* Try - Catch - Finally
  * The 'try' statement allows you to define a block of code to be tested for errors while it is being executed.
  * The 'catch' statement allows you to define a block of code to be executed, if an error occurs in the try block.
  * The 'finally' statement lets you execute code, after try...catch, regardless of the result
* Throw
  * The throw statement allows you to create a custom error.
  * The throw statement is used together with an exception type.