import java.util.*;
public class RemoveConsequetiveSubsequence {
    public static int[] result(int arr[]){
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(i==arr.length-1 || arr[i]!=arr[i+1]){
                st.pop();
            }
        }
        int res[] = new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,3,4,4,4,5,6,6,7,7,8};
        System.out.println("After removing the consequetive subsequence: ");
        for(int i=0;i<result(arr).length;i++){
            System.out.print(result(arr)[i]+" ");
        }
        System.out.println();
    }
}
