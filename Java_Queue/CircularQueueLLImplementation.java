class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class CircularQueueLL{
    private Node head;
    private Node tail;
    private int size = 0;
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    void add(int x){
        Node newNode = new Node(x);
        if(size == 0){
            head = tail = newNode;
            tail.next = head;
            head.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }
    int remove() throws Exception{
        if(size == 0){
            throw new Exception("Error: Queue is empty");
        }
        int data = head.data;
        if(size == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
        size--;
        return data;

    }
    int peek() throws Exception{
        if(size == 0){
            throw new Exception("Error: Queue is empty");
        }
        return head.data;
    }
    void displayQueue(){
        if(size == 0){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        Node temp = head;
        while(true){
            System.out.print(temp.data);

            if(temp == tail){
                break;
            }

            System.out.print(",");
            temp = temp.next;
        }
        System.out.println("]");
    }
}
public class CircularQueueLLImplementation{
    public static void main(String args[]) throws Exception{
        CircularQueueLL q = new CircularQueueLL();
        q.add(10);
        q.add(20);
        q.displayQueue(); // Output: [10,20]
        System.out.println(q.remove()); // Output: 10
        q.displayQueue(); // Output: [20]
    }
}