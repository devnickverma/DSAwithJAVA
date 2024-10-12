import java.util.*;
public class insertionSort{
    public static void InsertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
          int crnt = arr[i]; // Current element
          int prev = i-1; // Previous element

          // Finding out the correct position to insert
          while(prev >= 0 && arr[prev] > crnt){
              arr[prev+1] = arr[prev];
              prev--;
          }

          // Insetion
          arr[prev+1] = crnt;
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
      int arr[] = {5,3,52,54,353,2};
      InsertionSort(arr);
      printArray(arr);
  }
} 