import java.util.*;
public class countSetBits{ 
    public static int countOfSetBits(int n){
        int cnt = 0;
        while(n!=0){
             if((n&1)==1){ // Check LSB
                cnt++;
             }        
             n = n>>1;  
        }
        return cnt;
           
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = 15;
        System.out.println("Count of Set Bits is : " + countOfSetBits(n));
    }
}