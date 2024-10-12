import java.util.*;
public class subArray{
    public static void subArrays(int arr[]){
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
              for(int k=i; k<=j; k++){
                System.out.print(arr[k] + " ");
              }
              ts++;
              System.out.println();
            }
              System.out.println();
        }
        System.out.print("Total no. of Sub Arrays : " + ts);
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
      subArrays(arr);
  }
} 