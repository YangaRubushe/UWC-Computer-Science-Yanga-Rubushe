// Author: Rubushe Yanga 
// File name: PriorityQueue.java

import java.util.Comparator;
import java.util.NoSuchElementException;

public class PriorityQueue 
{
    /* attributes */
    private int currentSize; // Number of elements in heap
    private PriorityQueueNode [ ] PQ; // The priority queue array
    private static final int DEFAULT_CAPACITY = 2>>14; 
    private Comparator<? super PriorityQueueNode> cmp; // object to compare to instances of PriorityQueueNode

    /* default constructor */
    public PriorityQueue( )
    { 
        currentSize = 0;
        cmp = null;
        PQ = new PriorityQueueNode [DEFAULT_CAPACITY + 1];
    }
    
    
    /* getter methods for attributes */
    public int getSize( )
    { 
        return currentSize; 
    }
    
   /* methods from Practical 4 (Phase 3) */
    public boolean add( FlightNode flight ) // [ 4 marks ]
    { 
       if( currentSize + 1 == PQ.length){
           doubleArray();
       }
       //percolateUp
       int hole = ++currentSize;
       PQ[0] = flight;

       for(; compare(flight , PQ[ hole/ 2])<0; hole/= 2){
           PQ[hole] = PQ[hole/2];

       }
       PQ[hole] = flight;
       return true;
       
    }


    public FlightNode remove( ) // [ 2 marks ]
    { 
        PriorityQueueNode minValue = element();
        PQ[1] = PQ[ currentSize--];
        percolateDown(1);

        return minValue;
        // insert code here
    }
    
    private void percolateDown( int hole ) // [ 6 marks ]
    { 
        int chld;
        PriorityQueueNode tmp = PQ[hole];
        
        for( ;hole*2 <= currentSize; hole = chld){
           chld = hole*2;
           if( chld != currentSize && compare(PQ[ chld + 1], PQ[chld])<0){
               chld++;

           }
           if(compare( PQ[chld], tmp) < 0){
               PQ[ hole ] = PQ[chld];
           }else{
               break;
           }
           PQ[hole] = tmp;
        }// insert code here
    }
    
    public void display() // [ 6 marks ]
    {
        PriorityQueueNode temp=root;
        PriorityQueueNode stack=new PriorityQueueNode();
        while (temp!=null||!stack.isEmpty()){
            if(temp!=null){
                stack.add(temp);
                temp=temp.getLeft();
            }
            else {
                temp=stack.pop();
                System.out.print(temp.val+"--");
                temp=temp.getRight();
            }
        }// insert code here
    }
    
    /* auxiliary methods: you may use the below methods to help you write your code, if necessary */
    private int compare( PriorityQueueNode lhs, PriorityQueueNode rhs )
    { 
        if(cmp == null)
        {
            return ((Comparable)lhs).compareTo(rhs);
        }
        else
        {
            return cmp.compare(lhs, rhs);
        }
    }
    
    public void swapReferences(PriorityQueueNode [] a, int p, int q)
    {
        PriorityQueueNode tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;
    }
    
    private void doubleArray( )
    { 
        PriorityQueueNode [ ] newArray;
        newArray =  new PriorityQueueNode[ PQ.length * 2 ];
        for( int i = 0; i < PQ.length; i++ )
            newArray[ i ] = PQ[ i ];
        PQ = newArray;
    }
    
    public PriorityQueueNode element( )
    { 
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        return PQ[1];
    }
    
    public void clear( )
    { 
        currentSize = 0;
    }
    
    public boolean isEmpty()
    {
        return currentSize==0;
    }
} 
// end of file