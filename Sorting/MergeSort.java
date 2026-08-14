import java.util.*;
import java.io.*;
class MergeSort{
    public static void merge(int arr[],int left,int mid,int right){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                ans.add(arr[i]);
                i++;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            ans.add(arr[i]);
            i++;
        }
        while(j<=right){
            ans.add(arr[j]);
            j++;
        }
        for(int k=0;k<ans.size();k++){
            arr[k+left] = ans.get(k);
        }
    }
    public static void mergeSort(int arr[],int left,int right){
        if(left==right){
            return;
        }
        int mid = left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}