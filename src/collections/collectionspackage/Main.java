package collections.collectionspackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(13);
        values.add(33);
        values.add(99);
        values.add(77);
        values.add(20);
        values.add(81);

        // 13, 3, 77, 99, -2, 81
//        Collections.reverse(values);
        System.out.println(values);


        Comparator<Integer> com = (int1, int2) -> {
//            if (int1 % 10 > int2 % 10)
            return int1 % 10 > int2 % 10 ? 1 : -1; // returning 1 means swap the values.
        };

        int decimalValue = (int) (Math.log(19) / Math.log(2)) + 1;
        System.out.println(decimalValue);

        values.sort(com);
        System.out.println(values);


        Collections.sort(values);
        System.out.println(values);
    }


}
