import java.util.*;
public class primesInRange{
    public static boolean check(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1; i<=n; i++){
        if (check(i)){
          System.out.print( i + " ");
        }
     }
    }
}