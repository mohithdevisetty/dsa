package collections.linkedlist;

public class MyCircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyCircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size++;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");

        // We can display starting from tail also:
//        Node node = tail;
//        if (tail != null) {
//            do {
//                System.out.print(node.value + " -> ");
//                node = node.next;
//            } while (node != tail);
//        }
//        System.out.println("TAIL");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (node.value == val) { // means we are deleting the head
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
        size--;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
