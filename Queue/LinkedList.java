class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class LinkedList{
    Node front = null;
    Node rear = null;
    void enQueue(int ele){
        Node newNode = new Node(ele);
        if(front==null){
            front=rear = newNode;
            return;
        }
        rear.next=newNode;
        rear = newNode;
    }
    void deQueue(){
        if(front==null){
            System.out.println("Queue is empty.");
            return;
        }
        if(front==rear){
            front=rear=null;
        }
        front = front.next;

    }
    void display(){
        Node temp = front;
        if(front==null){
            System.out.println("Queue is empty.");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        
    }

    public static void main(String[] args){

        LinkedList queue = new LinkedList();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.display();
        queue.deQueue();
        queue.display();

    }
}