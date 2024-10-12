import java.util.*;
public class updateIthBit{ 
    public static int updateBit(int n, int i, int newBit){
           
           int bitMask;
           bitMask = ~(1<<i); // BitMask to remove the i'th bit
           n = n&bitMask; // Clearing the i'th Bit
           
           bitMask = newBit<<i; // BitMask to Set the i'th bit
           return n|bitMask; // Seting the i'th Bit

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("After updating the I'th Bit no. is : " + updateBit(10, 2, 1));
    }
}