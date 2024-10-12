import java.util.*;
public class subString{ 
    public static String subString(String str, int s, int e){
       String str2 = "";
       for(int i=s; i<e; i++){
         str2 += str.charAt(i);
       }
       return str2;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "HelloWorld";
        
        System.out.println("SubString is without function : " + subString(str, 0, 5));
        // SubString function to find the substring of any String
        System.out.println("SubString is with function : " + str.substring(0, 6));
    }
}