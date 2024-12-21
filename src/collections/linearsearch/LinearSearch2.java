package collections.linearsearch;

public class LinearSearch2 {
    public static void main(String[] args) {
        String str = "Mohith";
        System.out.println(search(str, 'm'));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
