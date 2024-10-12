import java.util.*;
public class fastExponentiation{ 
    public static int exponentiationFast(int num, int pow){
        int ans = 1;
        while(pow!=0){
             if((pow&1)==1){ // Check LSB
                ans = ans * num;
             }  
             num = num * num;      
             pow = pow>>1;  
        }
        return ans;
           
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num = 2;
        int pow = 6;
        System.out.println("Exponentiation is : " + exponentiationFast(num, pow));
    }
}