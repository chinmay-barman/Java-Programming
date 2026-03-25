import java.util.*;
public class InnerStackCF {
    static void reverseStackRecursively(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStackRecursively(st);
        insertAtBottom(st, top);
    }
    static void removeAt(Stack<Integer>st, int i){
        int top = st.pop();
        if(st.size()==i){
            return;
        }
        removeAt(st, i);
        st.push(top);
    }
    static void removeBottom(Stack<Integer>st){
        int top = st.pop();
        if(st.isEmpty()){
            return;
        }
        removeBottom(st);
        st.push(top);
    }
    static void displayReverseRecursively(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRecursively(st);
        st.push(top);
    }
    static void displayRecursively(Stack<Integer>st){
        if(st.isEmpty()){
            System.out.print("Dsiplaying Satck in using Recursion ");
            return;
        }
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
    static void displayStack(Stack<Integer>st){
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        System.out.print("The Stack is: ");
        while(!temp.isEmpty()){
            System.out.print(temp.peek()+" ");
            st.push(temp.pop());
        }
        System.out.println();
    }
    static void deleteAt(Stack<Integer>st, int i){
        Stack<Integer>temp = new Stack<>();
        while(st.size()>i+1){
            temp.push(st.pop());
        }
        st.pop();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    static void insertAt(Stack<Integer>st, int i, int x){
        Stack<Integer>temp = new Stack<>();
        while(st.size()>i){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    static void insertAtBottom(Stack<Integer> st, int x){
        Stack<Integer>temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in Stack: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Stack: ");
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        System.out.println(st);
        reverseStackRecursively(st);
        System.out.println(st);
        sc.close();
    }   
}
