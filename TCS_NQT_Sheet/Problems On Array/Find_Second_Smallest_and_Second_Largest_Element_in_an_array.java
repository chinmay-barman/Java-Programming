import java.util.*;
public class Find_Second_Smallest_and_Second_Largest_Element_in_an_array{
    public static int findSecondSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static int findSecondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Array should have at least 2 elements.");
            return;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int secondSmallest = findSecondSmallest(arr);
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}