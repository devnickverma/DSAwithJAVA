import java.util.*;
public class basicArrays{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[50];
      arr[0] = sc.nextInt();
      arr[1] = sc.nextInt();
      arr[2] = sc.nextInt();
      System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
      System.out.println("Length : " + arr.length);
    }
}