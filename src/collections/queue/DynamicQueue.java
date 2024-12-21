package collections.queue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items to new temp array
            for (int i = 0; i < data.length; i++) {
                // here the first element in old array is not the 0th index.
                // First element is at 'front' and it can be at any index
                // So while inserting the first element in new array, we should start taking out elements from 'front'
                // That's why we are adding 'front' to i in every loop
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }
}
