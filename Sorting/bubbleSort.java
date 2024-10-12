import java.util.*;
public class bubbleSort{
    public static void BubbleSort(int arr[]){
        int temp, swap; // Temparory variable
        for(int turn = 0; turn<arr.length-1; turn++){
            swap = 0;
          for(int j=0; j<arr.length-1-turn; j++){
            if(arr[j] > arr[j+1]){
                // Swap
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;
            }
          }
          if(swap==0){
            break;
          }
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
      BubbleSort(arr);
      printArray(arr);
  }
} 