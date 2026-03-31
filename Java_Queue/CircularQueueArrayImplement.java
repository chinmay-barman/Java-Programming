class CircularQueueArray{
    private int arr[];
    private int front;
    private int rear;
    private int size;
    CircularQueueArray(int n){
        arr = new int[n];
        size = 0;
        front = -1;
        rear = -1;
    }
    int size(){
        return size;
    }
    void add(int data)throws Exception{
        if(size == arr.length){
            throw new Exception("Cannot add element, Queue is full");
        }
        else if(size == 0){
            front = rear = 0;
            arr[rear] = data;
            size++;
        }
        else if(rear == arr.length -1){
            rear = 0;
            arr[rear] = data;
            size++;
        }
        else if(rear < arr.length -1){
            rear += 1;
            arr[rear] = data;
            size ++;
        }
    }
    int remove() throws Exception{
        if(size == 0){
            throw new Exception("Cannot remove element, Queue is empty");
        }
        int temp = arr[front];
        if(front == arr.length -1){
            front =0;
            size --;
        }
        else{
            front ++;
            size --;
        }
        if(size == 0){
            front = rear = -1;
        }
        return temp;
    }
    int peek(){
        if(size == 0){
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        return size == 0;
    }
    void displayQueue(){
        System.out.print("[");
        for(int i=0;i<size;i++){
            if((front+i)%arr.length == rear){
                System.out.print(arr[(front+i)%arr.length]);
                break;
            }
            System.out.print(arr[(front+i)%arr.length] + ",");
        }
        System.out.println("]");
    }
}
public class CircularQueueArrayImplement{
    public static void main(String args[]) throws Exception{
        CircularQueueArray q = new CircularQueueArray(5);
        q.remove();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.displayQueue();
        q.remove();
        q.add(6);
        q.displayQueue();
    }
}
