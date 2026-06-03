import java.util.Scanner;
import java.util.HashMap;
public class Count_frequency_of_each_element_in_the_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i],++count);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println("The frequency of each element in the array is:");
        for(Integer key: map.keySet()){
            System.out.println(key+ "-> "+map.get(key)+" ");
        }
    }
}
