import java.util.*;
public class SumOneToN{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int cnt = 1;
      int sum = 0;
      while(cnt<=n){
        sum += cnt;
        cnt++;
      }
      System.out.print("Sum is : " + sum);
    }
}