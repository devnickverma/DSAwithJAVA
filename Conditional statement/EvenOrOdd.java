import java.util.*;
public class EvenOrOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }
}