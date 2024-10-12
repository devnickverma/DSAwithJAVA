import java.util.Arrays; // Array package import
import java.util.*;
import java.util.Collections; // Collection package import
public class inbuiltSort{
    
    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      Integer arr[] = {4, 5, 9, 3, 10};
      // Arrays.sort(arr); // Withput Parameters
      // Arrays.sort(arr, 0, 3); // With parameters

      // In reverse/decreasing order 
      // Arrays.sort(arr, Collections.reverseOrder()); // Withput Parameters
      Arrays.sort(arr, 0, 2, Collections.reverseOrder()); // With parameters

      printArray(arr);
  }
} 