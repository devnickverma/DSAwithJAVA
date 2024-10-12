import java.util.*;
public class sumFunction{
     public static void print(int a, int b){
        System.out.println("Sum is : " + (a+b));
     }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
        print(a,b);
    }
}