import java.util.*;
public class taxCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Income : ");
        float inc = sc.nextFloat();
        if(inc<500000){
           System.out.print(" No Tax");
        } 
        else if(inc<1000000 && inc>=500000){
           System.out.print(" 20% Tax : " + ((inc/100)*20));
        }
        else {
           System.out.print(" 30% Tax : " + ((inc/100)*30));
        }
        
    }
}