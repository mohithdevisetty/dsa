package collections.linkedlist;

public class MainForDLL {

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        list.displayInReverseOrder();

        list.insertAfter(199, 65);
        list.display();


//        System.out.println(list.deleteFirst());
//        list.display();

//        System.out.println(list.deleteLast());
//        list.display();

//        System.out.println(list.delete(100));
//        list.display();

//        System.out.println(list.find(100));
    }

}
