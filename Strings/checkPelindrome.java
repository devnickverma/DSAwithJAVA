import java.util.*;
public class checkPelindrome{ 
    public static boolean check(String str){
       for(int i=0; i<str.length()/2; i++){
          if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
          }
       }
       return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(!check(str)){
          System.out.print("String is not a pelindrom");
        }
        else {
          System.out.print("String is a pelindrom");
        }
    }
}