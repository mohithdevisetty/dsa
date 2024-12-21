package collections.queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    // Here in queue we point to last element, so calling this pointer as end
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!!");
        }
        int removed = data[0];

        // after removing the head, we should shift all items in array to 1 cell left
        // also reduce 1 to end
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        // Suggested in video
//        for (int i = 1; i < end; i++) {
//            data[i - 1] = data[i];
//        }
        end--;
        return removed;
    }

    // returns the first element in the queue
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!!");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end == data.length; // means ptr is at last index
    }

    private boolean isEmpty() {
        return end == 0; // means ptr is not yet increased
    }
}
