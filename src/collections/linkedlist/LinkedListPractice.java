package collections.linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        l.add(5, "hundred");

        System.out.println(l);


        Collection<String> collect = new ArrayList<>();
        collect.add("A");
        collect.add("Computer");
        collect.add("Portal");
        collect.add("for");
        collect.add("Geeks");


        l.addAll(collect);

        System.out.println(l);

        ListIterator<String> list_Iter = l.listIterator(6);

        // Iterating through the created list from the position
        System.out.println("The list is as follows:");
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }



    }
}
