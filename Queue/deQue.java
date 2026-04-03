package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class deQue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(20);
        dq.offerFirst(25);
        dq.offerFirst(28);
        dq.add(3);
        dq.addLast(4);
        dq.offerLast(5);
        System.out.println(dq);
        dq.poll();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        System.out.println(dq.size());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


    }
    
}
