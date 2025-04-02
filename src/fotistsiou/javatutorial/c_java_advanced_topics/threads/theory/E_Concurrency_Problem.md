# Concurrency Problems

Here's a picture that explains how a thread actually starts and why it is not happening immediately.

![ConcurrencyProblem.png](images/ConcurrencyProblem.png)

As you may see, there is some delay between starting a thread and the moment when it really starts working (running).

Despite the fact that within a single thread all statements are executed sequentially, it is impossible to determine the
relative order of statements between multiple threads without additional measures.

Because threads run at the same time as other parts of the program, there is no way to know in which order the code will
run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The
problems that result from this are called **concurrency problems**.

To avoid **concurrency problems**, it is best to share as few attributes between threads as possible. If attributes need
to be shared, you can use:

- `isAlive()`: This method checks if a thread is still running. While it can be used to check if a thread has finished
  execution before accessing shared attributes, it does not provide synchronization or prevent race conditions.
- `sleep()`: This pauses a thread for a specified duration. While it can be used to introduce delays, it does not help
  with safely sharing attributes between threads.
- `TimeUnit`: This is a utility class that provides time-based operations (e.g., `TimeUnit.SECONDS.sleep(1)`). It works
  similarly to `Thread.sleep()`, but with improved readability.
- `join()`: This makes one thread wait for another to finish execution. It ensures that a thread completes before
  another one proceeds, helping avoid race conditions in some cases.