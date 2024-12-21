package collections.linkedlist;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);

        // If no tail variable available/provided:
        Node last = head;

        node.next = null; // becoz we are adding the element at the last

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) { // last.next will give NPE if head is null
            last = last.next;
        }

        last.next = node;
        node.prev = last;

        // If tail variable is available/provided:
        tail = node;

        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node successor = temp.next;

        Node node = new Node(val, successor, temp);
        temp.next = node;
        successor.prev = node;
        size++;
    }

    public void insertAfter(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println(after + " Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (value == node.value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayInReverseOrder() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.println("START");
    }


    public class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}
