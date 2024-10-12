import java.util.*;
public class hollowRhombus{
    public static void pattern(int n){
       for(int i=1; i<=n; i++){ 
        for(int j=1; j<=n-i; j++){ 
            System.out.print(" ");
        }
        for(int k=1; k<=n; k++){
                if(k==1 || i==1 || k==n || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
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