import java.util.*;
public class NextGreaterElement{
    public static void nextGreaterElement(int arr[], int nextGreater[]){
           Stack<Integer> s = new Stack<>(); // stack to store next greater element
           for(int i = arr.length - 1; i >= 0; i--){ // iterate from last element to first element
               while(!s.isEmpty() && s.peek() <= arr[i]){ // while stack is not empty and top of stack is less than current
                   s.pop(); // pop the top of stack as it is less than current element
               }
               if(s.isEmpty()){ // if stack is empty 
                   nextGreater[i] = -1; // next greater element of current element is -1 as there is no element greater than current
               }else{
                   nextGreater[i] = s.peek(); // next greater element of current element is top of stack as there is an element greater than current
               }
               s.push(arr[i]); // push current element in stack as there is an element greater than current
           }
    }
    public static void main(String args[]){
        int arr [] = {6, 8, 0, 1, 3};
        int nextGreater [] = new int[arr.length];
        nextGreaterElement(arr, nextGreater);
        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }
}