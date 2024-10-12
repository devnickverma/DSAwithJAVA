import java.util.*;
public class FactOfA_N{
    public static int Fact(int n){ // Parameters or formal parameters
     int f =  1;
     for(int i = 1; i<=n; i++){
        f = f*i;
     }
     return f;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("Product is =  " + Fact(n));
    }
}