import java.util.*;
public class clearlastiBits{ 
    public static int clearBits(int n, int i){
           
           int bitMask = ~(0)<<i;
           return n&bitMask;
           
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("After clearing the I'th Bit  no. is : " + clearBits(15, 2));
    }
}