import java.util.*;
public class SwitchStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("Case 1");
                    break;
            case 2 : System.out.println("Case 2");
                    break;
            case 3 : System.out.println("Case 3");
                    break;
            default : System.out.println("Default case");
        }
    }
}