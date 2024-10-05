import java.util.Arrays;  
public class combine{  
  
public static void main(String[] args)   
{  

int a[] = {23,45,12,78,4,90,1};        //source array  
int b[] = {77,11,45,88,32,56,3};  //destination array  
int fal = a.length;        //determines length of firstArray  
int sal = b.length;   //determines length of secondArray  
int c[] = new int[fal + sal];  //resultant array of size first array and second array  
System.arraycopy(a, 0, c, 0, fal);  
System.arraycopy(b, 0, c, fal, sal);  
System.out.println(Arrays.toString(c));    //prints the resultant array  
}  
} 

