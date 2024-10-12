import java.util.*;
public class selectionSort{
    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
          int minIndex = i; // Minimum value
          for(int j=i+1; j<arr.length; j++){
            if(arr[minIndex] > arr[j]){
                minIndex = j;
            }
          }
          // Swap
          int temp = arr[minIndex];
          arr[minIndex] = arr[i];
          arr[i] = temp;
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
      SelectionSort(arr);
      printArray(arr);
  }
} 