import java.util.*;
public class NextGreaterElement {
    public static int[] nextGreater(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        res[arr.length-1] = -1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
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
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = nextGreater(arr);
        System.out.println("Actual array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Resultant array is: ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
