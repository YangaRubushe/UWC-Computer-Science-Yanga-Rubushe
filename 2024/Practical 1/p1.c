// Author: Yanga Rubushe
//Exercise 1 - p1.c 
#include <stdio.h>

void main(void)
{
    int x = 6;
    char y = 'A';
    double z = 12.5;
    
    int* x_ptr = &x;
    char* y_ptr = &y;
    double* z_ptr = &z;
    //// Int
    printf(" Int Value is : %d Address is: 0x%x Memory is : %zu bytes\n", x, &x, sizeof(x));
    printf(" Pointer Value is : %d Address is: 0x%x Memory is : %zu bytes\n\n", *x_ptr, &x_ptr, sizeof(x_ptr));
    
    /// Character
    printf(" Character Value is : %c, Address is: 0x%x Memory is : %zu bytes\n", y, &y, sizeof(y));
    printf(" Pointer Value is : %c, Address is: 0x%x Memory is : %zu bytes\n\n", *y_ptr, y_ptr, sizeof(y_ptr));
    
    /// Double
    printf(" Double Value is : %.2lf, Address is: 0x%x Memory is : %zu bytes\n", z, &z, sizeof(z));
    
    printf(" Pointer Value is : %.2lf, Address is: 0x%x Memory is : %zu bytes\n", *z_ptr, z_ptr, sizeof(z_ptr));

}
