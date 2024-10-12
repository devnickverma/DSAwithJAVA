import java.util.*;
public class arrayFunction{
    public static void change(int marks[]){
        for(int i=0; i<marks.length; i++){
           marks[i] = marks[i]+10;
        }
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arr[] = {1,2,3};
      change(arr);
       for(int i=0; i<arr.length; i++){
           System.out.println("value : " + arr[i]);
        }
    }
}