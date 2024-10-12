import java.util.*;
public class binomialCofficient{
     public static int fact(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans*i;
        }
        return ans;
     }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int r = sc.nextInt();
      System.out.println("Binomial Cofficient is : " + (fact(n)/(fact(r)*fact(n-r))));
    }
}