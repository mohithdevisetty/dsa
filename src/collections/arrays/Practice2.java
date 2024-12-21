package collections.arrays;

public class Practice2 {
    //Find numbers in the array with even number of digits.
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int x = 7896 / 10;
//        System.out.println(x);
        x = 7896 % 10;
        System.out.println(evenDigits(7889));
//        System.out.println(findEvenNumbers(arr));
        System.out.println(Math.log10(10) + 1);

    }

    static int findEvenNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int counter = 0;
            while (temp > 0) {
                temp = temp >> 1;
                counter++;
            }
            if((counter & 1) == 0) {
                count++;
            }
        }
        return count;
    }

    static boolean evenDigits(int x) {
        int counter = 0;
        while(x > 0) {
            x = x / 10;
            counter++;
        }
        return (counter & 1) == 0;
    }
}
