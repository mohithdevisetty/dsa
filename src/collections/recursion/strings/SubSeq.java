package collections.recursion.strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subSeq("", "abc");
//        System.out.println(subSeqWithList("", "abc"));
        int x = 'a';
        int ch = 'a' + 'b';
        System.out.println(x);
        System.out.println((char) 195);
    }

    // p - processed
    // up - unprocessed
    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // same as subSeq method but returning the subsets as a list
    static ArrayList<String> subSeqWithList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqWithList(p + ch, up.substring(1));
        ArrayList<String> right = subSeqWithList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
