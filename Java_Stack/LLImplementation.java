class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
    }
}
class StackJava{
    private Node head = null;
    private int size = 0;
    void push(int x){
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty.");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }
    void display(){
        Node temp = head;
        for(int i=0;i<size();i++){
            for(int j=0;j<size()-i-1;j++){
                temp = temp.next;
            }
            System.out.print(temp.val+" ");
            temp = head;
        }
        System.out.println();
    }
    int size(){
        return this.size;
    }
    boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
}
public class LLImplementation {
    public static void main(String args[]){
        StackJava st = new StackJava();
        st.push(5);
        st.push(6);
        st.push(2);
        st.push(3);
        st.push(0);
        st.display();
    }
}
