import java.util.*;
public class displayNumbersButNotMultipleOfTen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        while(i<=5){
            System.out.print("Enter the number : ");
            n = sc.nextInt();
            if(n%10==0){
            System.out.println("Skip");
              i++;
            continue;
            }
            System.out.println(n + " ");
            i++;
        }
    }
}