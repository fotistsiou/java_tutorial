package fotistsiou.javatutorial.c_java_advanced_topics.threads.examples;

public class MainThread {
    public static void main(String[] args) {
        // Main thread
        Thread t = Thread.currentThread();

        // The characteristics of the main thread
        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.threadId());
        System.out.println("Alive: " + t.isAlive()); // returns whether the thread has been started and hasn't died yet
        System.out.println("Priority: " + t.getPriority()); // returns the priority of a given thread
        System.out.println("Daemon: " + t.isDaemon()); // checks whether the thread is a daemon

        // Change characteristics of the main thread
        t.setName("my-thread");
        System.out.println("New name: " + t.getName());

        // Min and Max Priorities
        System.out.println("Min Priority: " + java.lang.Thread.MIN_PRIORITY);
        System.out.println("Max Priority: " + java.lang.Thread.MAX_PRIORITY);
    }
}
