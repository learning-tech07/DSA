
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
public class LinkedList{
    Node head = null;
    void addFirst(int d){
        Node newNode = new Node(d);
        if(head==null){
            head = newNode;
            newNode = head;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    void addLast(int d){
        Node newNode = new Node(d);
        if(head==null){
            head = newNode;
            newNode = head;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
        newNode.next=null;

    }
    void addMiddle(int d , int element){
        Node newNode = new Node(d);
        Node temp = head;
        while(temp.data!=element&&temp.next!=null){
            temp = temp.next;
        }
        if(temp.data==element && temp!=null){
        newNode.next=temp.next;
        temp.next=newNode;
        }else System.out.println("element not found");
    }
    void addIndex(int d,int index){
        Node newNode = new Node(d);
        Node temp = head;
        for(int i =1 ; i<index;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }
    void deleteLast(){
        if(head==null) return;
        if(head.next == null){            // only one node
        head = null;
        return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;
    }
    void deleteFirst(){
        if(head==null) return;
        if(head!=null){
            head= head.next;
            return;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(8);
        list.addFirst(4);
        list.addFirst(9);
        list.display(); 
        System.out.println();
        list.addLast(2);
        list.addLast(3);
        list.addLast(7);
        list.deleteLast();
        list.display();
        list.addMiddle(1,8); 
        System.out.println(); 
        list.display();
        list.addIndex(6,3);
        System.out.println(); 
        list.display();
        list.deleteFirst(); 
        System.out.println(); 
        list.display();    
    }
}