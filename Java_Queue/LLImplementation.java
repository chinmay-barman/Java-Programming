class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class QueueLL{
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    void enqueue(int x){
        Node newNode = new Node(x);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    int dequeue(){
        if(head==null){
            System.out.println("Error, Queue is Empty!");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        if(head == null){
            tail = null;
        }
        return x;
    }
    int peek(){
        if(head == null){
            System.out.println("Error, Queue is Empty!");
            return -1;
        }
        return head.val;
    }
    void printQueue(){
        Node temp = head;
        System.out.print("[");
        while(temp != null){
            if(temp!=tail){
                System.out.print(temp.val+",");
            }
            else{
                System.out.print(temp.val);
            }
            temp = temp.next;
        }
        System.out.println("]");
    }
}
public class LLImplementation {
    public static void main(String args[]){
        QueueLL q = new QueueLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();
        q.dequeue();
        q.printQueue();
        System.out.println(q.dequeue());
        q.printQueue();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
