import java.util.*;
public class pairsInTheArrsay{
    public static void pairs(int arr[]){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
              System.out.print("("+ arr[i] +", " +arr[j] +") " );
              cnt++;
            }
              System.out.println();
        }
        System.out.println("Total no. of pairs : " + cnt); 
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {2,4,6,8,10};
      pairs(arr);
  }
} 