import java.util.*;
public class PassOrFail{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     String type = (num>=33)?"Pass":"Fail";
     System.out.println(type);
    }
}