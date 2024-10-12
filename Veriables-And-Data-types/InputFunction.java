import java.util.*;
public class InputFunction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        System.out.print("Enter String : ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        System.out.println(number);
    }
}