import java.util.*;
public class powerOfTwo{ 
    public static int isPowerOfTwo(int n){
        
           return n&(n-1);
           
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
         int n = 16;
         if(isPowerOfTwo(n)==0){
            System.out.println( n + " Is a power of 2 ");
         }
         else {
            System.out.println( n + " Is not a power of 2 ");
         }
    }
}