package collections.recursion;

public class FibonacciSeries {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println(findNthFibonacci(5));
    }

    static int findNthFibonacci(int n) {
        count++;
        // base condition
        if (n < 2) {
            return n;
        }
        System.out.println("The value of n is : " + n + " and count is : " + count);
        return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
    }
}
