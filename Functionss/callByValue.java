import java.util.*;
public class callByValue{
    public static void swap(int a, int b){ // Parameters or formal parameters
     int temp = a;
     a = b;
     b = temp;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = 5;
     int b = 10;
     swap(a, b);
     System.out.println("A = " + a);
     System.out.println("B = " + b);
    }
}