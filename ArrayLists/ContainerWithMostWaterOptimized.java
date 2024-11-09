import java.util.*;
public class ContainerWithMostWaterOptimized{
    public static int storedWaterOptimized(ArrayList<Integer> height){
        int maxArea = 0; // Max area 
        int left = 0, right = height.size()-1;   
        while(left < right){
            int heightDiff = Math.min(height.get(left), height.get(right)); // Minimum height
            int width = right-left; // Width
            int currArea = heightDiff*width; // Current area
            maxArea = Math.max(maxArea, currArea); // Updating max area
            if(height.get(left) < height.get(right)){
                left++; // Moving left pointer
            }else{
                right--; // Moving right pointer
            }
        }
        return maxArea;
    }

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println( "Stored water is : "+ storedWaterOptimized(height));
    }

}