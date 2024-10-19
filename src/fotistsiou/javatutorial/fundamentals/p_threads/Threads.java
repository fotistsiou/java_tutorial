package fotistsiou.javatutorial.fundamentals.p_threads;

/* Threads */
// -> Threads allows a program:
//    - to operate more efficiently by doing multiple things at the same time.
//    - to perform complicated tasks in the background without interrupting the main program.
// -> There are two ways to create a thread:
//    - By extending the Thread class.
//    - By extending the Runnable interface.
// The major difference is that when a class extends the Thread class, you cannot extend any other class,
// but by implementing the Runnable interface, it is possible to extend from another class as well,
// like: class MyClass extends OtherClass implements Runnable.

public class Threads {

    // Inner class that extends Thread class
    static class ExtendsThread extends Thread {
        @Override
        public void run() {
            System.out.println("This code is running in a Thread thread");
        }
    }

    // Inner class that implements Runnable interface
    static class ImplementsRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("This code is running in a Runnable thread");
        }
    }

    public static void main(String[] args) {
        // The thread can be run by creating an instance of the class and call its start() method
        ExtendsThread thread1 = new ExtendsThread();
        thread1.start();
        System.out.println("This code is outside of the Thread thread");

        // The thread can be run by passing an instance of the class to a Thread object's constructor
        // and then calling the thread's start() method:
        ImplementsRunnable obj = new ImplementsRunnable();
        Thread thread2 = new Thread(obj);
        thread2.start();
        System.out.println("This code is outside of the Runnable thread");
    }
}
