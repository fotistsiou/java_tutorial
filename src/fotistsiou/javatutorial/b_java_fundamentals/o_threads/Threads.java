package fotistsiou.javatutorial.b_java_fundamentals.o_threads;

/**
 * Threads
 * -> Threads allows a program:
 *    - to operate more efficiently by doing multiple things at the same time.
 *    - to perform complicated tasks in the background without interrupting the main program.
 * -> There are two ways to create a thread:
 *    - By extending the Thread class.
 *    - By extending the Runnable interface.
 * The major difference is that when a class extends the Thread class, you cannot extend any other class,
 * but by implementing the Runnable interface, it is possible to extend from another class as well,
 * like: class MyClass extends OtherClass implements Runnable.
 * --------------------------------------------------------------------------------------------------------------
 * Concurrency Problems
 * -> Because threads run at the same time as other parts of the program,
 *    there is no way to know in which order the code will run.
 *    When the threads and main program are reading and writing the same variables, the values are unpredictable.
 *    The problems that result from this are called concurrency problems.
 * -> To avoid concurrency problems, it is best to share as few attributes between threads as possible.
 *    If attributes need to be shared, one possible solution is to use the isAlive() method of the thread
 *    to check whether the thread has finished running before using any attributes that the thread can change.
 */

public class Threads {

    // ExtendsThread Inner class that extends Thread class
    static class ExtendsThread extends Thread {
        @Override
        public void run() {
            System.out.println("This code is inside of the ExtendsThread class");
        }
    }

    // ImplementsRunnable Inner class that implements Runnable interface
    static class ImplementsRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("This code is inside of the ImplementsRunnable class");
        }
    }

    // ResolveConcurrencyProblem Inner class that extends Thread class
    static class ResolveConcurrencyProblem extends Thread {
        @Override
        public void run() {
            System.out.println("This code is inside of the ResolveConcurrencyProblem class");
        }
    }

    public static void main(String[] args) {
        // The thread can be run by creating an instance of the class and call its start() method
        ExtendsThread thread1 = new ExtendsThread();
        thread1.start();
        System.out.println("This code is outside of the ExtendsThread class");

        // The thread can be run by passing an instance of the class to a Thread object's constructor
        // and then calling the thread's start() method:
        ImplementsRunnable obj = new ImplementsRunnable();
        Thread thread2 = new Thread(obj);
        thread2.start();
        System.out.println("This code is outside of the ImplementsRunnable class");

        // The program wait for the thread to finish
        ResolveConcurrencyProblem thread3 = new ResolveConcurrencyProblem();
        thread3.start();
        while(thread3.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("This code is outside of the ResolveConcurrencyProblem class");
    }
}
