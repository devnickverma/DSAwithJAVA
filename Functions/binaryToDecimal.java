import java.util.*;
public class binaryToDecimal{
    public static void decimal(int n){
        int i=0;
        int ans = 0;
        while(n!=0){
            ans += (n%10)*Math.pow(2,i);
            n = n/10;
            i++;
        }
        System.out.println(ans);
    }

    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      decimal(n);
   }
}