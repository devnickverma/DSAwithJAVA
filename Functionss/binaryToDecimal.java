import java.util.*;
public class binaryToDecimal{
     public static int BinaryToDec(int n){
        int ans = 0;
        int i = 0;
        while(n!=0){
            ans = ans + ((int)Math.pow(2,i)*(n%10));
            i++;
            n = n/10;
        }
        return ans;
     }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       System.out.println("Decimal form of " + n + " is " + BinaryToDec(n));
    }
}