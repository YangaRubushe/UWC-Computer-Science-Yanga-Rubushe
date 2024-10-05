//Author: Yanga Rubushe
//Exercise 2 - p1.c

#include <stdio.h>
#include <pthread.h>

// Define a mutex variable to synchronize
pthread_mutex_t lock;

// Shared float variable initialized to 64.0
float shared_var = 64.0;

// Function to increment the shared variable
void *incr(void *arg) {
    // Lock the mutex before accessing the shared variable
    pthread_mutex_lock(&lock);
    
    // Increment the shared variable by 1.0
    shared_var += 1.0;
    
    // Print the updated value of the shared variable
    printf("Incremented: %.2f\n", shared_var);
    
    // Unlock the mutex after modifying the shared variable
    pthread_mutex_unlock(&lock);
    
    return NULL;
}

// Function to decrement the shared variable
void *decr(void *arg) {
    pthread_mutex_lock(&lock);
    shared_var -= 1.0;
    printf("Decremented: %.2f\n", shared_var);
    pthread_mutex_unlock(&lock);
    return NULL;
}

// Function to halve the shared variable
void *halve(void *arg) {
    pthread_mutex_lock(&lock);
    shared_var /= 2.0;
    printf("Halved: %.2f\n", shared_var);
    pthread_mutex_unlock(&lock);
    return NULL;
}

// Function to double the shared variable
void *double_var(void *arg) {
    pthread_mutex_lock(&lock);
    shared_var *= 2.0;
    printf("Doubled: %.2f\n", shared_var);
    pthread_mutex_unlock(&lock);
    return NULL;
}

int main() {
    pthread_t tid[4];

    // Initialize the mutex
    pthread_mutex_init(&lock, NULL);

    // Create four threads, each performing a different operation
    pthread_create(&tid[0], NULL, incr, NULL);
    pthread_create(&tid[1], NULL, decr, NULL);
    pthread_create(&tid[2], NULL, double_var, NULL);
    pthread_create(&tid[3], NULL, halve, NULL);

    // Wait for all threads to finish execution
    for (int i = 0; i < 4; i++) {
        pthread_join(tid[i], NULL);
    }

    // Destroy the mutex
    pthread_mutex_destroy(&lock);

    return 0;
}