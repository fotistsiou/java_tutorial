# Debugging Techniques

Debugging is the process of finding and fixing bugs in a program.
The most popular ways that programmers use to debug a program are:

- Logging
- Assertions
- Debugger

## Logging

One way to track the changes in the program state is to insert additional print statements in the code. When executed,
they will inform you about what's happening under the hood at runtime.

## Assertions

- The assertion is a mechanism that monitors the program state, but unlike additional print statements, it terminates
  the program in a fail-fast manner when things go wrong.
- Fail-fast is an approach when errors that could otherwise be non-fatal are forced to cause an immediate failure, thus
  making them visible.

### How To Enable Assert In IntelliJ

> 1. Choose `Run` → `Edit Configurations...`.
> 2. Select the run configuration of interest.
> 3. Click on `Modify options` link and choose `Add VM options`
> 4. Add `-ea` to the `VM options box`.

![assertions_1.png](./images/assertions_1.png)
![assertions_2.png](./images/assertions_2.png)

## Debugger

A debugger is a tool that interferes with the normal program execution allowing you to get runtime information and test
different scenarios to diagnose bugs. This is the most popular use of debuggers. However, when you grow more experienced
with them, you'll see that they can be helpful in various situations, not necessarily related to bugs.

### How debuggers work

The main principle of debugging is that it can freeze the program execution, i.e. suspend it. This way one can examine
the program in this frozen state.

There are two ways to suspend the running code on debugging:

- set breakpoints in the code that you want to examine and wait until one of them is hit.
- break program execution by pressing hotkeys or the stop button if you are working in a graphical interface. The
  debugger will finish the statement that is executing at the moment and then will stop the program.

### Breakpoints

A breakpoint stands for a deliberate interruption of program execution. It is set at the point in the program at which
you want to check its operation. After the program reaches this point, it will pause. Then you will have the opportunity
to examine the state of the program, for example, logs, memory state, processor registers, stack, and so on.

In contrast to a complete stop, with the help of a break, in the debugger the program can be terminated or continued
from the same place where the break occurred.