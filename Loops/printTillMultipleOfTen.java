import java.util.*;
public class printTillMultipleOfTen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        while(true){
            System.out.print("Enter the number : ");
            n = sc.nextInt();
            if(n%10==0){
                System.out.print("Multiple of 10");
                break;
            }
            System.out.println(n + " ");
        }
    }
}