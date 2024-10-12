import java.util.*;
public class binarySearch{
    public static int BinarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1; 
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]<key){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return -1;
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {1,2,3,4,5,6,7,8,9};
      int key = 9;
      int ans = BinarySearch(arr, key);
      if(ans==-1){
        System.out.println("Element is not found");
      }
      else {
        System.out.println("Element is found at index : "+ ans); 
      }
  }
}