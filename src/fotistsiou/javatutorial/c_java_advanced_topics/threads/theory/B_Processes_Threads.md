# Processes & Threads

A computer runs applications and manages multitasking and parallel execution.

### Example

Imagine that you come to a food court during lunchtime, and you see a line of pizza shops there. Each shop's mission is
to sell pizza and each of them has several workers to accomplish this. So, each worker's purpose is to sell pizza, but
they can't sell it by themselves without the equipment provided by the shop. Likewise, any pizza shop can't sell
anything without its workers. That is, there has to be at least one worker in a pizza shop to do the job. Meaning, the
workers rely on the shop's equipment to do their jobs, just as the shop depends on these workers to function.

## Process

A **process** is an independent unit of execution that contains everything needed to complete its tasks. It serves as a
container for its threads, managing their execution and shared resources efficiently. Every process must have at least
one thread, as threads perform the actual work. There can be no standalone thread without a process, nor a process
without at least one thread.

### Example

If we look at the pizza business, a single pizza shop would serve as an analogy for the process. It provides all the
environment and equipment required for a worker to perform their job. Equipment is expensive, so it's cheaper and more
efficient when workers share it. There is no need for each worker to acquire personal equipment. On the other hand, a
shop cannot function without its workers; it is crucial to have at least one worker, as, without them, all the equipment
would remain idle. Together, these elements constitute the process of making and selling pizza.

## Thread

In computer science, a **thread** of execution is a sequence of instructions within a process that can be scheduled and
run independently. Each thread has its own executor, which can manage only one thread at a time. Multiple threads within
the same process can operate concurrently (switching between tasks) or in parallel (simultaneously, if multiple
executors are available), depending on how they are scheduled and the resources available.

### Example

To understand what the term thread means, think of employees in a pizza shop. They perform various tasks according to
their job descriptions, following the rules set by the shop and utilizing shared resources provided by the shop.
In this analogy, workers in a pizza shop represent thread executors, and the tasks they perform are the threads within
the pizza shop "process".

## Concurrency and Parallelism

**Concurrency** and **Parallelism** are fundamental computing concepts that describe different approaches to handling
multiple tasks efficiently.

- **Concurrency**: Manages multiple tasks by rapidly switching between them, creating the illusion of simultaneous
  execution. This improves responsiveness and resource utilization without true simultaneous execution.
- **Parallelism**: Executes multiple tasks at the same time, each handled by separate processing units, leading to
  actual simultaneous execution.

Both techniques optimize performance in multitasking environments but achieve it differently. Concurrency focuses on
managing multiple tasks efficiently, while parallelism involves executing them simultaneously.

### Example

- **Concurrency**: Imagine a chef in a kitchen preparing two dishes simultaneously. The chef starts by chopping
  vegetables for a salad, then while those vegetables are chilling, begins grilling chicken for another dish. The chef
  isn't working on both dishes at the exact same moment but switches between tasks, advancing both dishes without
  completing one before starting the other.
- **Parallelism**: Now picture a large kitchen where two chefs are working at the same time, one grilling chicken and
  the other preparing a salad. Each chef works independently on their dish, and both dishes are being prepared at the
  same time.

## Internal/Lightweight Concurrency

If tasks are lightweight and require minimal shared resources except the executor's time and attention, there is no need
to run them in separate threads. It is more efficient to manage their concurrent execution through time-slicing within a
single thread, where the executor switches between tasks quickly enough that they appear to be happening simultaneously.
This form of concurrency is often referred to as **internal** or **lightweight** due to the minimal nature of the tasks
involved.

### Example

In some cases, workers (threads) can perform multiple roles within the same pizza shop (process). For instance, a worker
might serve as both a cashier and a cook at different times. This kind of concurrency isn't about multiple workers doing
tasks simultaneously, but about a single worker switching between roles efficiently. These roles typically involve tasks
that are quick and do not demand significant time or shared resources, classifying them as **lightweight**.
