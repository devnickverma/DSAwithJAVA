import java.util.*;
public class triangle_0_and_1{
    public static void pattern(int n){
        int cnt = 1;
       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if(i%2==j%2){
                System.out.print(1 + " ");
            }
            else{
                System.out.print(0 + " ");
            }
            cnt++;
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
