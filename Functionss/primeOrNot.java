import java.util.*;
public class primeOrNot{
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
     if (check(n)){
        System.out.println("It is a prime");
     }
     else {
        System.out.println("It is not a prime");
     }
    }
}