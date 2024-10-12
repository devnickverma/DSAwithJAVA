import java.util.*;
public class product{
    public static int Product(int a, int b){ // Parameters or formal parameters
     return a*b;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = 5;
     int b = 10;
     System.out.println("Product is =  " + Product(a, b));
    }
}