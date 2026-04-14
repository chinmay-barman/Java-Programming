import structures.Node;
class DequeLL{
    private Node head;
    private Node tail;
    private int size;
    DequeLL(){
        this.size = 0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    void addFront(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = tail = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    void addLast(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    int removeFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Deque is empty");
        }
        int x = head.val;
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
        return x;
    }
    int removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Deque is empty");
        }
        int x = tail.val;
        if(head == tail){
            head = tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        return x;
    }
    int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        return head.val;
    }
    int getRear() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        return tail.val;
    }
    void displayDeque(){
        Node temp = head;
        System.out.print("[");
        while(temp!=null){
            if(temp == tail){
                System.out.println(temp.val+"]");
                return;
            }
            System.out.print(temp.val+",");
            temp = temp.next;
        }
    }
}
public class DequeLLImplementation {
    public static void main(String args[]) throws Exception{
        DequeLL dq = new DequeLL();
        dq.addFront(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.displayDeque();
        dq.removeFront();
        dq.removeLast();
        dq.displayDeque();
    }
}