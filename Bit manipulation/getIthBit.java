import java.util.*;
public class getIthBit{ 
    public static int getBit(int n, int i){
           int bitMask = 1<<i;
           if((n&bitMask)==0){
             return 0;
           }
           else {
             return 1;
           }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("I'th Bit is : " + getBit(10, 3));
    }
}