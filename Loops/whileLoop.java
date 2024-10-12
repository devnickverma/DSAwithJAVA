import java.util.*;
public class whileLoop{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int cnt = 1;
      while(cnt<=n){
        System.out.print(cnt + " ");
        cnt++;
      }
    }
}