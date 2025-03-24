package fotistsiou.javatutorial.c_java_advanced_topics.multiThreading_multiProcessing.examples;

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
