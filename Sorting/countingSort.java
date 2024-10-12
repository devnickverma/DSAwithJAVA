import java.util.Arrays; // Array package import
import java.util.*;
import java.util.Collections; // Collection package import
public class countingSort{
    
    public static void CountingSort(int arr[]){
        
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            mx = Math.max(mx, arr[i]);
        }

        int countArr[] = new int [mx+1];
        for(int i=0; i<arr.length; i++){
            countArr[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for(int i=0; i<countArr.length; i++){
            while(countArr[i] > 0){
               arr[j] = i;
               j++;
               countArr[i]--;
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
      int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
      
      CountingSort(arr);
      printArray(arr);
  }
} 