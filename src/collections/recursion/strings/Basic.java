package collections.recursion.strings;

public class Basic {
    public static void main(String[] args) {
        char ch = 'a';
        int x = ch;
        System.out.println(ch + 1);
        System.out.println(x);

        System.out.println(removeSpecificCharacterInString("baccadhaaa", 'a'));
        System.out.println(removeSpecificStringInInputString("baccadhaaaaapplee", "apple"));
        System.out.println(removeAppNotApple("baccadhaappl"));
    }

    static String removeSpecificCharacterInString(String input, char target) {
        if (input.isEmpty()) {
            return "";
        }

        char ch = input.charAt(0);
        String output;

        if (ch != target) {
            output = ch + removeSpecificCharacterInString(input.substring(1), target);
        } else {
            output = removeSpecificCharacterInString(input.substring(1), target);
        }
        return output;
    }

    static String removeSpecificStringInInputString(String input, String target) {
        if (input.isEmpty()) {
            return "";
        }

        if (input.startsWith(target)) {
            return removeSpecificStringInInputString(input.substring(target.length()), target);
        } else {
            return input.charAt(0) + removeSpecificStringInInputString(input.substring(1), target);
        }
    }

    // remove 'app' not 'apple'
    // it will remove 'app' when 'apple' is present in the string
    static String removeAppNotApple(String input) {
        if (input.isEmpty()) {
            return "";
        }

        if (input.startsWith("app") && !input.startsWith("apple")) {
            return removeAppNotApple(input.substring(3));
        } else {
            return input.charAt(0) + removeAppNotApple(input.substring(1));
        }
    }
}
