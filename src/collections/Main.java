package collections;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        int a = 10;
        System.out.println(a >> 2);
        System.out.println(~a);
//        decToBinary(a);

    }

    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[32];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
