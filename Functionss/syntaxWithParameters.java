import java.util.*;
public class syntaxWithParameters{
    public static int Sum(int a, int b){ // Parameters or formal parameters
      return a+b;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("SUM IS : " + Sum(a,b)); // Arguments or actual parameters
    }
}