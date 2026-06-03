import java.util.Scanner;
import java.util.Arrays;
public class Rearrange_array_in_increasingDecreasing_order {
    public static void rearrange(int arr[]){
        Arrays.sort(arr);
        int left = (arr.length+1)/2;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rearrange(arr);
        System.out.println("The rearranged array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
