package collections.recursion.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceFaceReturn("", 5, 12));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceReturn(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(p + i, target - i));
        }
        return list;
    }

    // It works for dice where face is not 6. It could be 8, 12 etc.
    static ArrayList<String> diceFaceReturn(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceReturn(p + i, target - i, face));
        }
        return list;
    }
}
