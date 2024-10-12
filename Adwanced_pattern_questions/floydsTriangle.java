import java.util.*;
public class floydsTriangle{
    public static void pattern(int n){
        int cnt = 1;
       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(cnt++ + " ");
        }
        System.out.println();
       }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
