import java.util.*;
public class continueStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
          if(i==3){
            continue;
            }
          System.out.print(i + " ");
        }
    }
}