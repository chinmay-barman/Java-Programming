class DequeArray{
    private int arr[];
    private int front;
    private int rear;
    private int size;
    private int capacity;
    DequeArray(int n){
        this.size = 0;
        arr = new int[n];
        front = -1;
        rear = -1;
        capacity = n;
    }
    int capacity(){
        return capacity;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    void addFirst(int data) throws Exception{
        if(size == capacity){
            throw new Exception("Deque is full");
        }
        else if(front == -1){
            front = rear = 0;
            arr[0] = data;
        }
        else if(size < arr.length && front == 0){
            front = arr.length-1;
            arr[front] = data;
        }
        else{
            arr[--front] = data;
        }
        size++;
    }
    void addLast(int data) throws Exception{
        if(size == capacity){
            throw new Exception("Deque is full");
        }
        else if(front == -1){
            front = rear = 0;
            arr[0] = data;
        }
        else if(size<arr.length && rear == arr.length-1){
            rear = 0;
            arr[rear] = data;
        }
        else{
            arr[++rear] = data;
        }
        size++;
    }
    int removeFirst() throws Exception{
        if(size == 0){
            throw new Exception("Deque is Empty!");
        }
        int x = arr[front];
        if(size == 1){
            front = rear = -1;
        }
        else if(front == arr.length-1){
            front = 0;
        }
        else{
            front++;
        }
        size--;
        return x;
    }
    int removeLast() throws Exception{
        if(size == 0){
            throw new Exception("Deque is Empty!");
        }
        int x = arr[rear];
        if(size == 1){
            front = rear = -1;
        }
        else if(rear == 0){
            rear = arr.length-1;
        }
        else{
            rear--;
        }
        size--;
        return x;
    }
    int getFront() throws Exception{
        if(size == 0){
            throw new Exception("Queue is Empty!");
        }
        return arr[front];
    }
    int getRear() throws Exception{
        if(size == 0){
            throw new Exception("Queue is Empty!");
        }
        return arr[rear];
    }
    void displayDeque() {
    System.out.print("[");
    for (int i = 0; i < size; i++) {
        System.out.print(arr[(front + i) % capacity]);
        if (i != size - 1) {
            System.out.print(",");
        }
    }
    System.out.println("]");
    }
}
public class DequeArrayImplementation {
    public static void main(String args[]) throws Exception{
        DequeArray dq = new DequeArray(5);
        dq.addFirst(1);
        dq.addLast(2);;
        dq.displayDeque();
    }
}
