import java.util.*;
public class reveseArray{
    public static void arrayReverse(int arr[]){
        int start = 0;
        int end = arr.length-1; 
        int temp;
        while(start<end){
         temp = arr[end];
         arr[end] = arr[start];
         arr[start] = temp;
         start++;
         end--;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {1,2,3,4,5,6,7,8,9};
      System.out.print("Original array : ");
      printArray(arr);
      System.out.print("Reversed array : ");
      arrayReverse(arr);
      printArray(arr);
  }
} 