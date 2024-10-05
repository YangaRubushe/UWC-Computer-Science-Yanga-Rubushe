//Author: Yanga RUBUSHE
//Exercise 1 – p1.c

#include <stdio.h>
#include <pthread.h>

void *Function1(){
    long sum = 0;
    for (long i = 0; i <1000000000; i++){
        sum += 1;
    }
}

void *Function2(){
    long sum = 0;
    for (long i = 0; i <5000000; i++){
        sum += 1;
    }
}

int main()
{
    printf("Expected Output:\n");
    pthread_t thread1;
    pthread_t thread2;
    
    pthread_create(&thread1, NULL, Function1, NULL);
    printf("Thread 1 complete\n");
    pthread_join(thread1, NULL);
    
    pthread_create(&thread2, NULL, Function2, NULL);
    printf("Thread 2 complete\n");
    pthread_join(thread2, NULL);
    
}