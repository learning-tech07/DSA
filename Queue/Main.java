package Queue;

class Main {
    int a[];
    int front, rear, max;

    Main(int size) {
        max = size;
        a = new int[max];
        front = rear = -1;
    }

    void enQueue(int ele) {
        if (rear == max - 1) {
            System.out.println("Queue is full.");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear++;
        }

        a[rear] = ele;
    }

    void deQueue() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Deleted Element: " + a[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main m1 = new Main(5);

        m1.enQueue(10);
        m1.enQueue(20);
        m1.enQueue(30);

        m1.display();

        m1.deQueue();
        m1.display();
    }
}