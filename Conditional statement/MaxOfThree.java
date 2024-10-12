import java.util.*;
public class MaxOfThree{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     if((a>=b)&&(a>=c)){
        System.out.println("A is the largest");
     }
     else if((b>=a)&&(b>=c)){
        System.out.println("B is the largest");
     }
     else {
        System.out.println("C is the largest");
     }
    }
}