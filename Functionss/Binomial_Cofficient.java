import java.util.*;
public class Binomial_Cofficient{
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
     int r = sc.nextInt();
     int ncr = Fact(n)/(Fact(r)*Fact(n-r));
     System.out.println("Binomial cofficient is =  " + ncr);
    }
}