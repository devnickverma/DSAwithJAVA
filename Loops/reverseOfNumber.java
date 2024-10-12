import java.util.*;
public class reverseOfNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int dgt;
        while(n>0){
            dgt = n%10;
            ans = (ans*10)+dgt;
            n = n/10;
        }
        System.out.println(ans);
    }
}