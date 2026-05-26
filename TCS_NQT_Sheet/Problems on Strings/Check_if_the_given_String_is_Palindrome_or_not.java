import java.util.*;
public class Check_if_the_given_String_is_Palindrome_or_not {
    public static boolean checkPalindromeBrute(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static String reverseString(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isPalindrome = checkPalindromeBrute(str);
        System.out.println(str.equals(reverseString(str)));
    }
}
