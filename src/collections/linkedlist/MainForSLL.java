package collections.linkedlist;

public class MainForSLL {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
//        list.insertFirst(null);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

//        System.out.println(list.delete(100));
        list.display();

//        System.out.println(list.find(100));
        System.out.println(list.getFromEnd(4));
    }
}
