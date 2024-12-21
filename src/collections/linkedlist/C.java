package collections.linkedlist;

public class C  implements A, B{
    public void fun() {
        System.out.println("fun method");
    }

    public static interface NestedInterface {
        boolean isOdd(int num);
    }

    public static void main(String[] args) {
        C.NestedInterface c = (num) -> (num & 1) == 1;
//        System.out.println(c.isOdd(0));

        int a = 35 ^ 40;
//        System.out.println(a);

        int b = 6 >> 1;
        System.out.println(b);

//        System.out.println(10 ^ 1);
    }
}
