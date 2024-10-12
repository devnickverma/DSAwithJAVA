import java.util.*;
public class stringComparison{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
     
        // NOTE :- When both Strings created without using new keyword can be Compared using == operator  
        if(s1 == s2){
          System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        // NOTE :- When either or both Strings created using new keyword can not be Compared using == operator  
        // s1 != s3 cuz of interning
        if(s1 == s3){
          System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
        
        // Using StringName.equals(); They can be olny compared using StringName.equals(); operator
        if(s1.equals(s3)){
          System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

         // Using .equals(); function
        if(s1.equals(s3)){
          System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}