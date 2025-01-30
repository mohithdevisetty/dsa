package collections.linkedlist;

import java.util.LinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
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

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node);
            size++;
            return newNode;
        }
        Node temp = insertRec(val, --index, node.next);
        node.next = temp;
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }

        Node secondLast = get(size - 2);

        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        // My logic
//        Node after = get(index + 1);
//        Node current = get(index);
//        Node prev = get(index - 1);
//        prev.next = after;
//        return current.value;

        // Explained logic
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Get the nth node from the end.
    // https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
    public int getFromEnd(int n) {
        if (size < n) {
            return -1;
        }
        return get(size - n).value;
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

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
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

    // Questions
    public void removeDuplicates() {
        Node node = head;

        while(node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // merge 2 sorted linked lists and return head of final linked list
    public static MyLinkedList merge(MyLinkedList first, MyLinkedList second) {
        Node f = first.head;
        Node s = second.head;

        MyLinkedList list = new MyLinkedList();

        while(f != null && s != null) {
            if (f.value < s.value) {
                list.insertLast(f.value);
                f = f.next;
            } else {
                list.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null) {
            list.insertLast(f.value);
            f = f.next;
        }

        while(s != null) {
            list.insertLast(s.value);
            s = s.next;
        }

        return list;
    }
}
