package fotistsiou.javatutorial.c_java_advanced_topics.threads.examples;

public class ConcurrencyProblem {
    static class ExtendsThread extends Thread {
        @Override
        public void run() {
            System.out.println("This code is inside of the ExtendsThread class");
        }
    }

    static class ResolveConcurrencyProblem extends Thread {
        @Override
        public void run() {
            System.out.println("This code is inside of the ResolveConcurrencyProblem class");
        }
    }

    public static void main(String[] args) {
        CustomThreads.ExtendsThread thread1 = new CustomThreads.ExtendsThread();
        thread1.start();
        System.out.println("This code is outside of the ExtendsThread class");

        ResolveConcurrencyProblem thread2 = new ResolveConcurrencyProblem();
        thread2.start();
        while(thread2.isAlive()) { // The program wait for the thread to finish
            System.out.println("Waiting...");
        }
        System.out.println("This code is outside of the ResolveConcurrencyProblem class");
    }
}
