// Surname: Rubushe
// Name: Yanga
// Year: 2023 
// Assignment: Practical 2 Term 2
// File: PriorityQueue.java
//Class PriorityQueue
class PriorityQueue {
    // Attributes
    private int currentSize; // Stores current number of elements in PQ
    private FlightNode[] array; // Array to store flight nodes, implements PQ
    private int DEFAULT_CAPACITY = 2>>10; // Maximum heap size
    
    // Constructors
    public PriorityQueue() {
        this.currentSize = 0;
        this.array = new FlightNode[DEFAULT_CAPACITY];
    }
    public PriorityQueue(int capacity) {
        if (capacity > 0) {
            this.currentSize = 0;
            this.array = new FlightNode[capacity];
        }
    }
    
    // Accessor methods
    public int getCurrentSize() {
        return this.currentSize;
    }
    public FlightNode[] getArray() {
        return this.array;
    }
    public int getDEFAULT_CAPACITY() {
        return this.DEFAULT_CAPACITY;
    }
    
    // Mutator methods
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
    public void setArray(FlightNode[] array) {
        this.array = array;
    }
    public void setDEFAULT_CAPACITY(int DEFAULT_CAPACITY) {
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
    }
    
    // Other methods
    public void clear() {
        this.currentSize = 0;
        this.array = new FlightNode[DEFAULT_CAPACITY];
    }
    public Boolean isEmpty() {
        return this.currentSize == 0;
    }
    public Boolean add(FlightNode x) {
        if (this.currentSize < this.array.length) {
            this.array[this.currentSize] = x;
            percolateUp(this.currentSize);
            this.currentSize++;
            return true;
        }
        return false;
    }
    public FlightNode remove() {
        FlightNode removed = this.array[0];
        this.array[0] = this.array[this.currentSize - 1];
        this.currentSize--;
        percolateDown(0);
        return removed;
    }
    public FlightNode peek() {
        return this.array[0];
    }
    public void percolateUp(int index) {
        FlightNode temp = this.array[index];
        int parent = (index - 1) / 2;
        while (index > 0 && temp.getPriority() < this.array[parent].getPriority()) {
            this.array[index] = this.array[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        this.array[index] = temp;
    }
    public void percolateDown(int index) {
        FlightNode temp = this.array[index];
        int child;
        while (index * 2 + 1 < this.currentSize) {
            child = index * 2 + 1;
            if (child != this.currentSize - 1 && this.array[child].getPriority() > this.array[child + 1].getPriority()) {
                child++;
            }
            if (temp.getPriority() > this.array[child].getPriority()) {
                this.array[index] = this.array[child];
                index = child;
            } else {
                break;
            }
        }
        this.array[index] = temp;
    }
}