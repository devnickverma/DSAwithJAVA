import java.util.*;
public class decimalToBinary{
     public static int DecToBin(int n){
        int ans = 0;
        int i = 0;
        while(n!=0){
            ans = ans + ((int)Math.pow(10,i)*(n%2));
            i++;
            n = n/2;
        }
        return ans;
     }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       System.out.println("Binary form of " + n + " is " + DecToBin(n));
    }
}