class QueueArray{
    private int front = -1;
    private int rear = -1;
    private int size = 0;
    private int arr[];
    QueueArray(int n){
        arr = new int[n];
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    void add(int x){
        if(rear == arr.length-1){
            System.out.println("OverFlow Error, Index out of Upper Bound.");
        }
        else{
            if(front == -1){
            front = 0;
            }
            rear++;
            arr[rear] = x;
            size++;
        }
    }
    int remove(){
        if(size == 0){
            System.out.println("Error, Queue is empty");
            return -1;
        }
        int x = arr[front];
        front++;
        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return x;
    }
    int element(){
        if(size == 0){
            System.out.println("Error, Queue is empty");
            return -1;
        }
        return arr[front];
    }
    void printQueue(){
        System.out.print("[");
        for(int i=front;i<=rear;i++){
            if(i!=rear){
                System.out.print(arr[i]+",");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
public class ArrayImplementation {
    public static void main(String args[]){
        QueueArray q = new QueueArray(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.printQueue();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.printQueue();
        q.add(6);
    }
}
