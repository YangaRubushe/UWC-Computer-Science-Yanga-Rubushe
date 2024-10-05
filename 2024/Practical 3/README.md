# Operating Systems - Task 2

## Overview

This directory contains code exercises completed as part of the Operating Systems class. The exercises focus on multithreading and synchronization using the C programming language and the POSIX threads (pthreads) library. 

## Code Description

### Thread Management

1. **thread1.txt**: 
   - This file demonstrates the creation of two threads that increment a shared counter. 
   - The threads run concurrently, and there is no synchronization mechanism in place, which may lead to race conditions.

2. **thread2.txt**: 
   - This file improves upon the first by introducing a mutex to synchronize access to the shared counter.
   - The mutex ensures that only one thread can modify the counter at a time, preventing race conditions and ensuring thread safety.

### Shared Variable Operations

3. **p1.c**: 
   - This file contains multiple functions that manipulate a shared float variable. 
   - The operations include incrementing, decrementing, halving, and doubling the variable.
   - A mutex is used to synchronize access to the shared variable, ensuring that operations are performed safely across multiple threads.

## Conclusion

These exercises illustrate the importance of thread synchronization in concurrent programming. Proper use of mutexes is crucial to avoid race conditions and ensure data integrity when multiple threads access shared resources.

## Author

Yanga Rubushe