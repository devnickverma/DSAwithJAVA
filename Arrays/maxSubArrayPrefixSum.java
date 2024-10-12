import java.util.*;
public class maxSubArrayPrefixSum{
    public static void maxSubArrays(int arr[]){
        int sum = 0; 
        int mx = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];

            prefixArr[0] = arr[0];

        for(int i=1; i<arr.length; i++){ // Calculating Values in prefix array
           prefixArr[i] = prefixArr[i-1] + arr[i]; 
        }
        // This is a prefix approach 
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
              sum = i==0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
              if(sum>mx){
                mx = sum;
              }
            }
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
      int arr[] = {1,-2,6,-1,3};
      maxSubArrays(arr);
  }
} 