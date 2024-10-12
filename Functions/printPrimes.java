import java.util.*;
public class printPrimes{
    public static boolean check(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void print(int n){
        for(int i=1; i<=n; i++){
          if(check(i)){
              System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      print(n);
   }
}