import java.util.*;
public class factorialFunction{
     public static void fact(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans*i;
        }
        System.out.println("Factorial is : " + ans);
     }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      fact(n);
    }
}