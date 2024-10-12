import java.util.*;
public class setIthBit{ 
    public static int setBit(int n, int i){
           
           int bitMask = 1<<i;
            
           return n|bitMask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("After setting the I'th Bit  no. is : " + setBit(10, 2));
    }
}