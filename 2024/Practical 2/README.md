# Task 1 - Multithreading and Shared Memory in C

This directory contains a series of C programming exercises focused on multithreading and shared memory, these exercises i do it on Operation System Class. This directory is authored by Yanga Rubushe. The exercises demonstrate the use of POSIX threads (pthreads) and shared memory in C, providing practical examples of concurrent programming.

## Exercise 1 - p1.c

In this exercise, the program creates two threads using the pthread library. Each thread executes a function that performs a simple summation operation. The first thread sums up to one billion, while the second thread sums up to five million. The program demonstrates the creation and joining of threads, as well as the basic structure of multithreaded applications.

### Key Features:
- Creation of threads using `pthread_create`.
- Joining threads with `pthread_join` to ensure completion before exiting the main program.
- Simple summation operations to illustrate thread execution.

## Exercise 2 - p2.c

This exercise extends the previous example by introducing shared memory. It creates a shared memory segment that both threads can access. Each thread performs its operation and updates the shared memory with a specific value. The program also measures the execution time of each thread and calculates the average duration of their execution.

### Key Features:
- Use of shared memory with `shmget` and `shmat` for inter-thread communication.
- Timing the execution of each thread using `clock`.
- Calculation of average execution time for both threads.
- Proper cleanup of shared memory resources after use.

## Conclusion

These exercises provide a foundational understanding of multithreading and shared memory in C. They illustrate how to create and manage threads, share data between them, and measure execution time, which are essential skills for developing concurrent applications in C.