import java.util.*;
public class MaxAreaInHistogram{
    public static int maxArea(int arr[]){
        int maxArea = 0;
        int nextSmallerLeft[] = new int[arr.length];
        int nextSmallerRight[] = new int[arr.length];

        // Next smaller element to the right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRight[i] = arr.length;
            }else{
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }

        // Next greater element to the left
         s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[i] = -1;
            }else{
                nextSmallerLeft[i] = s.peek();
            }
            s.push(i);
        }

        // Current area = width * height
        for(int i = 0; i < arr.length; i++){
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int height = arr[i];
            int area = width * height;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;

    }
    public static void main(String args[]){
      int arr[] = {2, 1, 6, 6, 7, 3};
      System.out.println("Max area : " + maxArea(arr));
    }
}