// Author: Yanga Rubushe
//Exercise 3 - p3.c 

/*Question 1
  The program, when compiled and run, prints the hexadecimal memory address of the character variable `c` (which is stored in the pointer `cp`). It then displays the character at that memory address (which is 'Z'). Finally, it shows the address after incrementing the pointer `cp` by 1, indicating the next memory location. The output confirms that adding 1 to a `char` pointer increments its address by 1 byte.
*/
#include <stdio.h>

int main() {
    char c = 'Z';
    char *cp = &c;

    printf("cp is 0x%8x\n", cp);
    printf("The character at cp is %c\n", *cp);

    /* Pointer arithmetic  - see what cp+1 is*/
    cp = cp + 1;
    printf("cp is 0x%8x\n", cp);
    
    /* Do not print *cp, because it points to
       memory not allocated to your program */

    // Question 2: Pointer arithmetic with int
    int i = 42;
    int *int_ptr = &i;

    printf("\nip is 0x%8x\n", int_ptr);
    printf("The integer at ip is %d\n", *int_ptr);

    /* Pointer arithmetic  - see what int_ptr+1 is*/
    int_ptr = int_ptr + 1;
    printf("ip is 0x%8x\n", int_ptr);
    
    // Question 3: Pointer arithmetic with double 
    double d = 3.14;
    double *dou_ptr = &d;

    printf("\ndp is 0x%8x\n", dou_ptr);
    printf("The double at dp is %lf\n", *dou_ptr);

    /* Pointer arithmetic  - see what dou_ptr+1 is*/
    dou_ptr = dou_ptr + 1;
    printf("dp is 0x%8x\n", dou_ptr);

    return 0;
}
