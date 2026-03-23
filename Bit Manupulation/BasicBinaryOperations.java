import java.util.*;
class BasicBinaryOperations{
    public static String decimalToBinary(int d){
        StringBuilder sb = new StringBuilder("");
        while(d>0){
            int r = d%2;
            sb.append(r);
            d = d/2;
        }
        sb.reverse();
        return sb.toString();
    }
    public static int binaryToDecimal(String b){
        double d = 0;
        double power = 0;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i) != '0' && b.charAt(i) != '1'){
                System.out.println("Invalid Binary Number");
                return -1;
            }
            double bit = b.charAt(i) -'0';
            d+= bit*Math.pow(2.0,power);
            power++;
        }
        return (int) d;
    }
    public static String onesComplement(String b){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<b.length();i++){
            if(b.charAt(i) != '0' && b.charAt(i) != '1'){
                System.out.println("Invalid Binary Number");
                return "-1";
            }
            int bit = b.charAt(i) -'0';
            int onesComp = 1-bit;
            sb.append(onesComp);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Decimal to Binary.");
        System.out.println("2. Binary to Decimal.");
        System.out.println("3. One's Complement of a Binary.");
        System.out.print("Enter options: ");
        int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the Decimal Number: ");
                int d = sc.nextInt();
                String b = decimalToBinary(d);
                System.out.println("Binary Equivalent of "+d+" is: "+b);
                break;
            case 2:
                System.out.println("Enter the Binary Number: ");
                String binary= sc.next();
                int decimal = binaryToDecimal(binary);
                if(decimal !=-1){
                    System.out.println("Decimal Equivalent of "+binary+" is: "+decimal);
                }
                break;
            case 3:
                System.out.println("Enter the Binary Number: ");
                String binary1 = sc.next();
                String onesComplement = onesComplement(binary1);
                if(onesComplement != "-1"){
                    System.out.println("Ones Complement of "+binary1+" is: "+onesComplement);
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
        sc.close();
    }
}