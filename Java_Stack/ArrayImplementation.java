class StackJava{
    private int arr[];
    private int c;
    private int index = 0;
    StackJava(int n){
        arr = new int[n];
        c = n;
    }
    void push(int x){
        if(isFull()){
            System.out.println("UpperBound Exception, Stack is already full, No push.");
            return;
        }
        this.arr[index] = x;
        index++;
    }
    int peek(){
        if(index == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[index-1];
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is already empty.");
            return -1;
        }
        int top = arr[index-1];
        arr[index-1] = 0;
        index--;
        return top;
    }
    void display(){
        System.out.print("[ ");
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    int size(){
        return index;
    }
    int capacity(){
        return c;
    }
    boolean isEmpty(){
        if(index==0){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(index==c){
            return true;
        }
        return false;
    }
}
public class ArrayImplementation {
    public static void main(String args[]){
        StackJava st = new StackJava(5);
        st.push(5);
        st.push(6);
        st.push(8);
        st.push(9);
        st.push(0);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.pop());
        st.display();
    }
}
