package collections.stack;

// since we already our CustomStack and wanted to utilize the functionality there, so extending it.
public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); // it will call the CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call the CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items to new temp array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // at this point we know that array is not full
        // so we can insert item
        return super.push(item);
    }
}
