import java.util.*;
public class funOverloading2{
    public static void sum(int a, int b){
        System.out.println("Sum of two integer : " + (a+b));
    }
     public static void sum(float a, float b){
        System.out.println("Sum of two float values : " + (a+b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        sum(a,b);
        sum(c,d);
    }
}