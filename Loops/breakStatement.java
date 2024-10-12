import java.util.*;
public class breakStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if(i==3){
                break;
            }
            System.out.println("Hello");
            i++;
        }
    }
}