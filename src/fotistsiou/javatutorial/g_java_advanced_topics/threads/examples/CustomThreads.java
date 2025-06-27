package fotistsiou.javatutorial.g_java_advanced_topics.threads.examples;

public class CustomThreads {
    // 1. Create a custom thread by extending the Thread class.
    static class ExtendsThread extends Thread {
        @Override
        public void run() {
            System.out.println("This code is inside of the ExtendsThread class");
        }
    }

    // 2. Create a custom thread by implementing the Runnable interface.
    static class ImplementsRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("This code is inside of the ImplementsRunnable class");
        }
    }

    public static void main(String[] args) {
        // Start a thread by extending the Thread class
        ExtendsThread thread1 = new ExtendsThread();
        thread1.start();
        System.out.println("This code is outside of the ExtendsThread class");

        // Starting a thread by implementing the Runnable interface and pass the implementation to the constructor
        // of the Thread class
        ImplementsRunnable obj = new ImplementsRunnable();
        Thread thread2 = new Thread(obj);
        thread2.start();
        System.out.println("This code is outside of the ImplementsRunnable class");

        // 3. Create a custom thread using lambda expressions
        Thread thread4 = new Thread(() -> {
            System.out.println(String.format("Hello, I'm %s!", Thread.currentThread().getName()));
        });
        thread4.start();
    }
}
