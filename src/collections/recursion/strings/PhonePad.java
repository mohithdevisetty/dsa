package collections.recursion.strings;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class PhonePad {
    public static void main(String[] args) {

    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0);

    }
}
