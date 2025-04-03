# Debugging methods

In order to inspect and control the execution of methods in classes, we will explore the following aspects:

- Setting breakpoints inside a method.
- How to trace method calls between two classes.
- Stepping through method calls.
- Distinguishing between line and method breakpoints.
- How to reset a method’s frame.

## Setting breakpoints in methods

One of the first steps in debugging a method is to set a breakpoint at a specific line of code within that method. A
breakpoint causes the running program to pause its execution when it reaches that line, allowing you to investigate what
is happening at that exact moment. Sometimes setting breakpoints in different parts of a method can help you better
examine the flow of data and setting it at the method's entry point will confirm whether the method is called at all.

### Debugging Steps

1. Set a Breakpoint
   - Identify a section of code where you suspect an issue or need to inspect values.
   - Insert a breakpoint at the beginning of the method or function of interest.
2. Start Debugging Mode
   - Run the program in Debug mode using your development environment's debugger.
   - The execution will pause at the breakpoint, allowing you to inspect or modify variables.

## Stepping through method calls

When your debugger is paused at a breakpoint, you have several options to control the flow of your program:

