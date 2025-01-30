package collections.linkedlist;

public class LinkedListQuestions {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(4);
        ll.insertLast(4);

        ll.display();

        ll.removeDuplicates();
        ll.display();

        MyLinkedList first = new MyLinkedList();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        MyLinkedList second = new MyLinkedList();
        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);
        second.insertLast(9);
        second.insertLast(14);

        MyLinkedList list = MyLinkedList.merge(first, second);
        list.display();


    }

}
