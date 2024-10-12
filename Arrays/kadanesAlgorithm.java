import java.util.*;
public class kadanesAlgorithm{
    public static void kadanes(int arr[]){
        int cs = 0;
        int mx = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            mx = Math.max(cs, mx);
        }
        
        System.out.println("The Maximum sum of subarray is : " + mx);
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {-2,-3,4,-1,-2,1,5,-3};
      kadanes(arr);
  }
} 