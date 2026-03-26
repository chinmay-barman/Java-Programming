import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueCF {
    public static void printQueue(Queue<Integer> q){
        Queue<Integer> temp = new ArrayDeque<>();
        while(!q.isEmpty()){
            temp.add(q.remove());
        }
        while(!temp.isEmpty()){
            System.out.print(temp.peek()+" ");
            q.add(temp.remove());
        }
        System.out.println();
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.element());
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());


        printQueue(q);      
    }
}
