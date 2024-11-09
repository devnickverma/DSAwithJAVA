import java.util.*;
public class ContainerWithMostWater{
    public static int storedWater(ArrayList<Integer> height){
        int maxArea = 0; // Max area    
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int heightDiff = Math.min(height.get(i), height.get(j)); // Minimum height
                int width = j-i; // Width
                int currArea = heightDiff*width; // Current area
                maxArea = Math.max(maxArea, currArea); // Updating max area
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

        System.out.println( "Stored water is : "+ storedWater(height));
    }

}