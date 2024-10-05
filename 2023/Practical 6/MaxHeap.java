public class MaxHeap<T extends Comparable<T>> {
    private ArrayList<T> heap;
    
    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public MaxHeap(int initialCapacity) {
        heap = new ArrayList<>(initialCapacity);
    }

    public int getSize() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public T getMax() {
        if (heap.isEmpty()) {
            return null; 
        } else {
            return heap.get(0);
        }
    }

    public void insert(T value) {
        heap.add(value);
        int index = heap.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (value.compareTo(parent) > 0) {
                heap.set(index, parent);
                heap.set(parentIndex, value);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    public T removeMax() {
        if (heap.isEmpty()) {
            return null;
        } else {
            T max = heap.get(0);
            T last = heap.remove(heap.size() - 1);
            if (!heap.isEmpty()) {
                heap.set(0, last);
                int index = 0;
                while (index < heap.size()) {
                    int leftIndex = 2 * index + 1;
                    int rightIndex = 2 * index + 2;
                    if (leftIndex >= heap.size()) {
                        break;
                    }
                    int maxIndex = leftIndex;
                    if (rightIndex < heap.size()) {
                        T left = heap.get(leftIndex);
                        T right = heap.get(rightIndex);
                        if (right.compareTo(left) > 0) {
                            maxIndex = rightIndex;
                        }
                    }
                    T maxChild = heap.get(maxIndex);
                    if (last.compareTo(maxChild) < 0) {
                        heap.set(index, maxChild);
                        heap.set(maxIndex, last);
                        index = maxIndex;
                    } else {
                        break;
                    }
                }
            }
            return max;
        }
    }
}
