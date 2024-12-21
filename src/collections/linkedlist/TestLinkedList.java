package collections.linkedlist;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(1);
//
//        System.out.println(list.size());

        // Declaring LinkedLists
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList prioList = new LinkedList();

        // adding elements
        list.add(12);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(3);
        list.add(15);

        // declaring threshold
        int thres = 10;

        // printing the list
        System.out.println("The initial Linked list is : " + list);

        while (!list.isEmpty()) {

            int t = list.poll();

            // adding >=10 numbers at front rest at back
            if (t >= 10)
                prioList.offerFirst(t);
            else
                prioList.offerLast(t);
        }

        // The resultant list is
        System.out.println("The prioritized Linked list is : " + prioList);
    }
}
