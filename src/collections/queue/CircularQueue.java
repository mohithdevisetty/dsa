package collections.queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    // returns the first element in the queue
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!!");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        // we are not taking end here because end will always
        // traverse and go to 0th index again in circular queue
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0; // means ptr is not yet increased
    }
}
