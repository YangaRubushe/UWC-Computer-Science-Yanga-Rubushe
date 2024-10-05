//Author: Yanga Rubushe
//Exercise 2 - p2.c

#include <stdio.h>
#include <pthread.h>
#include <time.h>
#include <sys/ipc.h>
#include <sys/shm.h>

// Define a global variable for shared memory
long *shared_val;

void *Function1() {
    clock_t start_time = clock();
    // Thread 1
    clock_t end_time = clock();
    double elapsed_time = (double)(end_time - start_time) / CLOCKS_PER_SEC;
   // printf("Thread1: 1\n");
    printf("thread1 took %.6f seconds to execute\n", elapsed_time);
    *shared_val = 2123435 ; // Set shared value to 1
}

void *Function2() {
    clock_t start_time = clock();
    // Thread 2
    clock_t end_time = clock();
    double elapsed_time = (double)(end_time - start_time) / CLOCKS_PER_SEC;
    //printf("Thread2: 2\n");
    printf("thread2 took %.6f seconds to execute\n", elapsed_time);
    *shared_val = 2; // Set shared value to 2
}

int main() {
    printf("Thread1: 1\n");
    printf("Thread2: 2\n");
    // Create shared memory segment
    int shmid = shmget(IPC_PRIVATE, sizeof(long), IPC_CREAT | 0666);
    if (shmid == -1) {
        perror("shmget");
        return 1;
    }

    // Attach shared memory
    shared_val = (long *)shmat(shmid, NULL, 0);
    if (shared_val == (long *)-1) {
        perror("shmat");
        return 1;
    }

    pthread_t thread1, thread2;
    pthread_create(&thread1, NULL, Function1, NULL);
    pthread_create(&thread2, NULL, Function2, NULL);

    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);

    // Calculate Avarage duration
    double ave_dur = (double)(clock()) / CLOCKS_PER_SEC;

    printf("thread1 and thread2 took %.6f seconds to execute\n", ave_dur);
    printf("average time taken was %.6f\n", ave_dur / 2.0);

    // Detach and remove shared memory
    shmdt(shared_val);
    shmctl(shmid, IPC_RMID, NULL);

    return 0;
}