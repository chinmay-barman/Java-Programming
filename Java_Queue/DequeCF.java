//import java.util.Queue;
//import java.util.PriorityQueue;
//import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeCF {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.add(3);
        dq.add(4);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.peekLast());
    }
}
