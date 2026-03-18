package Stack;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LL {
    Node top = null;

    void push(int d) {
        Node newNode = new Node(d);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return ;
        }
        top = top.next;
        return;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return ;
        }
        System.out.println(top.data);
        return;
    }

    void display() {
        if (top == null) {
            System.out.print("Stack Underflow");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Stack-End");
    }

    public static void main(String[] args) {
        LL s = new LL();

        s.pop();  // underflow

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}