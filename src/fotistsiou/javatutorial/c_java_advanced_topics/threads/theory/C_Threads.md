# Threads

Java was originally designed with built-in multithreading support. Threads are supported at the level of the JVM, at the
level of the language by special keywords, and at the level of the standard library. Every Java program has at least one
thread, which is called **main**, created automatically by the JVM process to execute statements inside the `main`
method. All Java programs have some other default threads as well (for example, a separate thread for the garbage
collector).

## The Main Thread

Each thread is represented by an object that is an instance of the `java.lang.Thread` class (or its subclass). This
class has a static method named `currentThread` to obtain a reference to the currently executing thread object:

```java
Thread t = Thread.currentThread();
```

### The information about the main thread

To obtain the characteristics of the main thread have to obtain a reference to it through an object of the Thread class.

Some of the characteristics of the main thread:

- The invocation `t.isAlive()` returns whether the thread has been started and hasn't died yet.
- Every thread has a **priority**, and the `getPriority()` method returns the priority of a given thread. Threads with a
  higher priority are executed in preference to threads with lower priorities.
- The invocation `t.isDaemon()` checks whether the thread is a **daemon**. A **daemon** thread (which comes from UNIX
  terminology) is a low-priority thread that runs in the background to perform tasks such as garbage collection and so
  on. JVM does not wait for daemon threads before exiting whereas it waits for non-daemon threads.

## Create A Thread

There are two ways to create a thread:

- By extending the Thread class.
- By implementing the Runnable interface.

The major difference is that when a class extends the Thread class, you cannot extend any other class, but by
implementing the Runnable interface, it is possible to extend from another class as well.

## Concurrency Problems

Because threads run at the same time as other parts of the program, there is no way to know in which order the code will
run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The
problems that result from this are called concurrency problems.

To avoid concurrency problems, it is best to share as few attributes between threads as possible. If attributes need to
be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished
running before using any attributes that the thread can change.