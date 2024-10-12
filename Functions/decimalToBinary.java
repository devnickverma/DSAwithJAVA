import java.util.*;
public class decimalToBinary{
    public static void binary(int n){
        int i=0;
        int ans = 0;
        while(n!=0){
            ans += (n%2)*Math.pow(10,i);
            n = n/2;
            i++;
        }
        System.out.println(ans);
    }

    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      binary(n);
   }
}