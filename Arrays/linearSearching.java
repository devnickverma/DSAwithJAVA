import java.util.*;
public class linearSearching{
    public static boolean linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
           if(arr[i]==key){
            return true;
           }
        }
        return false;
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {1,2,3,4,5,6,7,8,9};
      int key = 7;
      if(linearSearch(arr, key)){
       System.out.print("Element is found");
      }
      else {
        System.out.print("Element is not found");
      }
    }
}