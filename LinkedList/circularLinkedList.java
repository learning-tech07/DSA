class Node {
    int data;
    Node next;

    // Constructor to create a node
    Node(int d) {
        data = d;
        next = null;
    }
}

public class circularLinkedList {

    // Head pointer of circular linked list
    Node head = null;

    // ================= ADD FIRST =================
    void addFirst(int d) {
        Node newNode = new Node(d);

        // If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head;   // make circular
            return;
        }

        // Find last node
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        // Insert new node at beginning
        temp.next = newNode;      // last points to new node
        newNode.next = head;     // new node points to old head
        head = newNode;          // move head to new node
    }

    // ================= ADD LAST =================
    void addLast(int d) {
        Node newNode = new Node(d);

        // If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head;   // circular link
            return;
        }

        // Find last node
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        // Insert at end
        temp.next = newNode;
        newNode.next = head;      // new node points to head
    }

    // ================= ADD MIDDLE =================
    // Insert a new node just BEFORE the given target value
    void addMiddle(int target, int data) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node newNode = new Node(data);

        // If target is at head, insert at first
        if (head.data == target) {
            addFirst(data);
            return;
        }

        Node temp = head;

        // Traverse to find the node before target
        while (temp.next != head && temp.next.data != target) {
            temp = temp.next;
        }

        // If target is not found
        if (temp.next == head) {
            System.out.println("Element not found!");
            return;
        }

        // Insert new node before target
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ================= REMOVE FIRST =================
    void removeFirst() {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If only one node
        if (head.next == head) {
            head = null;
            return;
        }

        // Find last node
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        // Remove head
        temp.next = head.next;
        head = head.next;
    }

    // ================= REMOVE LAST =================
    void removeLast() {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If only one node
        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        // Move to second last node
        while (temp.next.next != head) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = head;
    }

    // ================= DISPLAY =================
    void display() {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;

        // Traverse circular list
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        circularLinkedList cl = new circularLinkedList();

        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.display();

        cl.addMiddle(30, 99);   // insert 99 before 30
        cl.display();

        cl.addFirst(5);
        cl.display();

        cl.removeLast();
        cl.display();

        cl.removeFirst();
        cl.display();
    }
}
