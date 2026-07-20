import java.io.*;
import java.util.*;
public class Rotate_Array{
    public static void reverse(int arr[], int left, int right){
    	while(left<right){
        	arr[left] = arr[left]^arr[right];
            arr[right] = arr[left]^arr[right];
            arr[left] = arr[left]^arr[right];
            left++;
            right--;
        }
    }
    public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        k = k%n;
        int nums[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
        	nums[i] = Integer.parseInt(st.nextToken());
        }
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        for(int i=0;i<n-1;i++){
        	System.out.print(nums[i] + " ");
        }
        System.out.print(nums[n-1]);
    }
}