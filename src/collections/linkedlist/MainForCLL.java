package collections.linkedlist;

public class MainForCLL {

    public static void main(String[] args) {
        MyCircularLinkedList list = new MyCircularLinkedList();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();

        list.delete(19);
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
