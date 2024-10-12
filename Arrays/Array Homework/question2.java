import java.util.*;
public class question2{
    public static int check(int arr[], int key){
        for(int i=0; i<arr.length; i++){
           if(arr[i] == key){
              return i;
           }
        } 
        return -1;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {4, 5, 6, 3, 0, 1, 2};
      System.out.println(check(arr, 3));
  }
}


