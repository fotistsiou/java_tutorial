# Thread management

## Start

The `start()` method is used to begin the execution of a new thread. When a thread is started using `start()`, it moves
from the **new state** to the **runnable state** and waits for the CPU to schedule its execution. This method internally
calls the `run()` method of the thread but does not execute it immediately; instead, it allows the thread scheduler to
manage execution.

## IsAlive

The `isAlive()` method checks whether a thread has been started and is still running. It returns `true` if the thread is
running or waiting, and `false` if it has not been started or has already completed execution.

## Sleep

The **static method** `Thread.sleep()` causes the currently executing thread to suspend execution for the specified
number of milliseconds. This is an efficient means of making processor time available for the other threads of an
application or other applications that might be running on a computer.

### TimeUnit

Another way to make the current thread sleep is to use the special class `TimeUnit` from the package
`java.util.concurrent`:

- `TimeUnit.MILLISECONDS.sleep(2000)` performs `Thread.sleep` for **2000 milliseconds**.
- `TimeUnit.SECONDS.sleep(2)` performs `Thread.sleep` for **2 seconds**.

There are more existing periods: `NANOSECONDS`, `MICROSECONDS`, `MILLISECONDS`, `SECONDS`, `MINUTES`, `HOURS`, `DAYS`.

## Join

The join method forces the current thread to wait for the completion of the thread for which the method `join` was
called.

The overloaded version of this method takes a waiting time in milliseconds `thread.join(2000L);`. This is used to avoid
waiting for too long or even infinitely in case the thread is hung.
