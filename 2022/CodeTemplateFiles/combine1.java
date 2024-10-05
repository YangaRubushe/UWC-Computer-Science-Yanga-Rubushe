import java.util.stream.Stream;   
import java.util.Arrays;      
public class combine1  
{   
  
public static <Tutorial> Object[] combine(Tutorial[] a, Tutorial[] b)   
{   
return Stream.of(a, b).flatMap(Stream::of).toArray();   
}   
public static void main (String[] args)    
{   
Integer[] arr1 = new Integer[]{1,3,5,7,9};   
Integer[] arr2 = new Integer[]{0,2,4,8,10 };   
Object[] c = combine(arr1,arr2);   
System.out.println( Arrays.toString(c));   
}   
}