//Author: Rubushe Yanga

//QuicksortTester
public class QuicksortTester {
    private static final int CUTOFF = 10; // Define CUTOFF for insertion sort

    /**
 * Quicksort algorithm (driver)
 */


 public  void quicksort( int [ ] a ) {
     quicksort( a, 0, a.length - 1 );
 }

 /**
 * Internal quicksort method that makes recursive calls.
 * Uses median-of-three partitioning and a cut-off.
 */

 public void quicksort( int [ ] a, int low, int high )
 {
 if( low + CUTOFF > high ){
     insertionSort( a );
    }else{ 
        // Sort low, middle, high
        int middle = ( low + high ) / 2;
        if( a[ middle ] < a[ low ] ){
            swapReferences( a, low, middle );
        }
        if( a[ high ] < a[ low ] ){
            swapReferences( a, low, high );
        } 
        if( a[ high ] < a[ middle ] ){
            swapReferences( a, middle, high );
        }

        // Place pivot at position high - 1
        swapReferences( a, middle, high - 1 );
        int pivot = a[ high - 1 ];

        // Begin partitioning
        int i, j;
        for( i = low, j = high - 1; ; ){

            while( a[ ++i ] < pivot );
            while( pivot < a[ --j ] );
            if( i >= j )
               break;
            swapReferences( a, i, j );

        }
        // Restore pivot
        swapReferences( a, i, high - 1 );

        quicksort( a, low, i - 1 ); // Sort small elements
        quicksort( a, i + 1, high ); // Sort large elements
    }
 }

 
// insert code here for question 3
 public void insertionSort(int A[]){
     for(int i = 1; i < A.length; i++){
         int tmp = A[i];
         int j = i - 1;
         while (j >= 0 && A[j] > tmp) {
             A[j + 1] = A[j];
             j--;
         }
         A[j + 1] = tmp;
     }
 }

 // insert code here for question 4 a)
 public void insertionSort(int A[]){
     for(int i = 1; i<A.length; i++){
         int tmp = A[i];
         int j = i;
     }
     int tmp = 0;
    for (; CUTOFF > 0 && tmp == (A[CUTOFF - 1]); CUTOFF--) {
         A[CUTOFF]= tmp;
     }

 }

 // insert code here for question 4 b)
 private void swapReferences(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
    
    
 }

 // insert code here for question 5)
 public static boolean removeDuplicates(int []A) {
     int n = A.length;
     if (n == 0 || n == 1) return false;
     int[] temp = new int[n];
     int j = 0;
     for (int i = 0; i < n - 1; i++) {
         if (A[i] != A[i + 1]) {
             temp[j++] = A[i];
         }
     }
     temp[j++] = A[n - 1];
     return j < n; // returns true if duplicates were found
 }

 // insert code here for question 6)
 public static void main(String[] args) {
    int[] a = { 10, 7, 8, 9, 1, 5, 8, 6, 10, 1 };
    int[] A = { 10, 7, 8, 9, 1, 5,  8, 6, 10, 1 };
    int n = A.length;
     
    ///quicksort(a, 0, a.length - 1);
    
    removeDuplicates(A);
 }

}
