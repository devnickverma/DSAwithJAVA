import java.util.*;
public class checkIfPrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean check = true;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
            check = false;
            break;
            }
            i++;
         }
        if(check==true){
             System.out.println("Prime number");
        }
        else {
            System.out.println("Not a Prime number");
        }
    }
} 