import java.util.*;
public class butterflyPattern{
    public static void pattern(int n){
       for(int i=1; i<=n; i++){ // Upper part
        for(int j=1; j<=i; j++){ // Stars =>  i
            System.out.print("*");
        }
        for(int j=1; j<=(n-i)*2; j++){ // Spaces =>  (n-i)*2
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){ // Stars =>  i
            System.out.print("*");
        }
        System.out.println();
       }

       for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=(n-i)*2; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}