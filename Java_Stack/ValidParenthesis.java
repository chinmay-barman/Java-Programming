import java.util.*;
public class ValidParenthesis {
    public static boolean checkValidParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check Valid Parenthesis: ");
        String s = sc.next();
        System.out.println(checkValidParenthesis(s));
        sc.close();
    }
}
