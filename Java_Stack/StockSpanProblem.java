import java.util.*;
public class StockSpanProblem {
    public static int[] stockSpan(int price[]){
        int span[] = new int[price.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<price.length;i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input array
        System.out.println("Enter the number of days: ");
        int n = sc.nextInt();
        int price[] = new int[n];
        System.out.println("Enter the stock price for "+n+" days: ");
        for(int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }
        // Resultant array
        int span[] = stockSpan(price);
        System.out.println("Stock span for "+n+" days: ");
        for(int i=0;i<n;i++){
            System.out.print(span[i]+ " ");
        }
        System.out.println();
        sc.close();
    }
}
