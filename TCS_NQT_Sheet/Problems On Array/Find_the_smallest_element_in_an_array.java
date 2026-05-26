import java.util.*;

public class Find_the_smallest_element_in_an_array {
    public static int findMin(int arr[]){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
    return min;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = findMin(arr);
        System.out.println("Smallest Element in the array is: "+min);
    }
}