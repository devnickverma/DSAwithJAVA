import java.util.*;
public class clearIthBit{ 
    public static int clearBit(int n, int i){
           
           int bitMask = ~(1<<i);
    
           return n&bitMask;
           
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("After clearing the I'th Bit  no. is : " + clearBit(10, 1));
    }
}