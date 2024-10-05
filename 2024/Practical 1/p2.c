// Author: Yanga Rubushe
//Exercise 2 - p2.c 
#include <stdio.h>

void foo1(int xval) {
    int x;
    x = xval;
    printf("Address of x in foo1: %p\n", (void*)&x);
    printf("Value of x in foo1: %d\n", x);
}

void foo2(int dummy) {
    int y;
    y = dummy; /// Initialize y with the value of dummy  (11)
    printf("Address of y in foo2: %p\n", (void*)&y);
    printf("Value of y in foo2: %d\n", y);
}

int main() {
    foo1(7);
    foo2(11);
    return 0;
}
/*
The addresses of `x` and `y` might appear close or even the same because they are both local variables allocated on the stack within their respective functions. However, it's important to note that the values of `x` and `y` are independent variables and not related to each other. 

In the given code, `y` is not explicitly initialized within the `foo2` function. As a result, it may hold an arbitrary value, often referred to as garbage value, from whatever was previously stored in that memory location. This is why the address of `y` may match that of `x`, and the value printed for `y` may not reflect the value passed as an argument.

To ensure that `y` prints the correct value passed as an argument (`dummy`), it's necessary to explicitly initialize `y` with the value of `dummy` within the `foo2` function. This guarantees that `y` holds the intended value and produces the expected output.
*/