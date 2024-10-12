import java.util.*;
public class clearRangeOfBits{ 
    public static int clearBits(int n, int i, int j){
           
           int a = ~(0)<<(j+1);
           int b = (1<<i)-1;
           int bitMask = a|b;
           return n&bitMask;
           
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("After clearing the Bits no. is : " + clearBits(31, 1, 3));
        // Here 31 = 1 1 1 1 1
        // i = 1       ^   ^
        // j = 3      j+1  i    So after clearing these bits 
        // Ans 17 =  1 0 0 0 1
    }
}