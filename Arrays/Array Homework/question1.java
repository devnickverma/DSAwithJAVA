import java.util.*;
public class question1{

    // Brute Force O(n^2)
    public static boolean containsDuplicate(int[] nums) {
      for(int i=0; i<nums.length-1 ; i++) { 
        for(int j=i+1; j<nums.length ; j++ ) { 
          if( nums[i] == nums[j] ) {
             return true ; 
          }
        } 
      } 
      return false; 
   }

   // Using sets O(n)
   public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>(); 
    for(int i=0; i<nums.length; i++) {
         if(set.contains(nums[i])) {
             return true;
         }
         else { 
            set.add(nums[i]); 
         } 
    } 
    return false;
}


    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
    //   int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 7};
    int arr[] = {1, 7, 3, 1};
      System.out.println(containsDuplicate(arr));
  }
}