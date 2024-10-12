import java.util.*;
public class largestNumber{
    public static int largestNum(int arr[]){
        int ans = Integer.MIN_VALUE; // -Infinity
        int min = Integer.MAX_VALUE; // +Infinity
        for(int i=0; i<arr.length; i++){
           if(arr[i]>ans){
            ans = arr[i];
           }
           if(arr[i]<min){
            min = arr[i];
           }
        }
        System.out.println("Smallest element is : "+ min);
        return ans;
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {1,2,3,4,5,6,7,8,9};
      System.out.println("Largest element is : "+ largestNum(arr));
  }
}