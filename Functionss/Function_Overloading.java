import java.util.*;
public class Function_Overloading{
    public static int sum(int a, int b){ // Parameters or formal parameters
     return a+b;
    }
    public static int sum(int a, int b, int c){ // Parameters or formal parameters
     return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = 1;
     int b = 2;
     int c = 3;
     System.out.println("Sum of two Integer values = " + sum(a, b));
     System.out.println("Sum of three Integer values = " + sum(a, b, c));
     System.out.println("Sum of two Integer values = " + sum(3.5f, 2.5f));
    }
}