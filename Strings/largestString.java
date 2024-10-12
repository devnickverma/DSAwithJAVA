import java.util.*;
public class largestString{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String fruits[] = {"apple", "mango", "banana"};        
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
             if(largest.compareTo(fruits[i]) < 0){
              largest = fruits[i];
             }
        }
        System.out.println("Largest string is : " + largest);
    }
}