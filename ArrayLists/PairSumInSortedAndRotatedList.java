import java.util.*;
public class PairSumInSortedAndRotatedList{
    public static boolean pairSum(ArrayList<Integer> list, int target ){
           int pivot = -1;
           for(int i=0; i<list.size(); i++){
             if(list.get(i) > list.get(i+1)){
                pivot = i;
                break;
             }
           }
           int left = pivot + 1;
           int right = pivot;
           int n = list.size();
           while(left!=right){
                // Case 1
                if(list.get(left) + list.get(right) == target){
                    return true;
                }
                // Case 2
                else if(list.get(left) + list.get(right) < target){
                    left = (left + 1) % n;
                }
                // Case 3
                else {
                    right = (n + right - 1) % n;
                }
           }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println( "Pair sum : "+ pairSum(list, target));
    }

}