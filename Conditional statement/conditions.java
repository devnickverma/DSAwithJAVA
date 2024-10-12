import java.util.*;
public class conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if(age>=18){
           System.out.print("Adult");
        } 
        else if(age<18 && age>=13){
           System.out.print("Teenager");
        }
        else {
            System.out.print("Child");
        }
        
    }
}