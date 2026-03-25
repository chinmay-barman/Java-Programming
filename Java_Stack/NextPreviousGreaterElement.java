import java.util.*;
public class NextPreviousGreaterElement {
    public static int [] previousGreater(int arr[]){
        Stack<Integer>st = new Stack<>();
        int res[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i] =-1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static int [] previousGreater2(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){  
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.peek()] =-1;
            st.pop();
        }
        return res;
    }
    public static int[] nextGreater(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer>st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
                st.push(arr[i]);
            }
            else{
                res[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return res;
    }
    public static int[] nextGreater2(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer>st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.peek()] = -1;
            st.pop();
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = nextGreater2(arr);
        System.out.println("Actual array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Resultant Next Greater Element Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

        int prevRes[] = previousGreater2(arr);
        System.out.println("The Resultant Previous Greater Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(prevRes[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
