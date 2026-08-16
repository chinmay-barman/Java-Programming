import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
class ThreeSum{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        List<List<Integer>> ans = threeSum(arr);
        System.out.print("[");
        for(int i=0;i<ans.size();i++){
            System.out.print("[");
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j));
                if(j!=ans.get(i).size()-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(i!=ans.size()-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    public static List<List<Integer>> threeSum(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
            //Duplicate Handling
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                    ans.add(temp);
                    //Both moved to avoid duplicate
                    left++;
                    right--;
                    //Further Duplicate Skipping
                    while(left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while(left<right && arr[right]==arr[right+1]){
                        right--;
                    }
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }
}must be 