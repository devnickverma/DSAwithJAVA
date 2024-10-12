import java.util.*;
public class maxSubArray{
    public static void maxSubArrays(int arr[]){
        int ts = 0, sum;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = 0;
              for(int k=i; k<=j; k++){
                sum = sum + arr[k];
              }
              ts++;
              if(sum<mn){
                 mn = sum;
              }
              if(sum>mx){
                mx = sum;
              }
            }
        }
        System.out.println("Total no. of Sub Arrays : " + ts);
        System.out.println("The Maximum sum of subarray is : " + mx);
        System.out.println("The Minimum sum of subarray is : " + mn);
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