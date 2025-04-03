# Bugs in Program

A **software bug** is a problem that causes a program to crash or produce invalid output. There are many reasons for
software bugs, the most common of them are human mistakes in software design, coding, or understanding of the
requirements.

## Why do programs have bugs?

Developers often say that a program without bugs doesn't exist. There are some common reasons for bugs in software:

- communication issues in the team
- misunderstanding of the requirements
- software complexity
- programming errors (programmers, like anyone else, can make mistakes)
- time pressure
- use of unfamiliar technologies
- an error in a third-party library (yes, that happens too)

## Avoiding bugs

It is almost impossible to avoid all bugs in a large program, but it is possible to reduce their number. Here we give
you five steps that can help to do that in both educational courses and industrial programming.

1. Make sure you know what to do. As a programmer, you need to understand the requirements of a program that you are
   going to work on. If you have doubts, you can always find some help on the Internet or among fellow developers.
2. Decompose a program into small units that are easy to look through and understand. A good architecture reduces
   software complexity, and, as a consequence, the number of errors.
3. Write easy-to-read-code and follow all the standards of the language. It will also allow you to make fewer errors.
4. Run the program with boundary input values. Do not forget to consider different cases: 0 or a huge number as an input
   value, 0 or 1 element as an input sequence. Such cases often reveal bugs.
5. Write automated tests that will check the program at the build time.

## Debugging

To locate a buggy place, you can:

1. read the code and try to understand what it does for the input values
2. start the debugger and see the current values of variables and the control flow of the program
3. print the current state of the program in critical parts of the code (logging) and then analyze it

The combination of the approaches above will allow you to find most of the bugs in your program.