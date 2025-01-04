package collections.recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(1000005));
    }

    static int reverse(int n) {
        if (n % 10 == n) {
            return n;
        }
        int multiplier = (int) (Math.log10(n / 10)) + 1;
        return (n % 10) * (int) Math.pow(10, multiplier) + reverse(n / 10);
    }
}
