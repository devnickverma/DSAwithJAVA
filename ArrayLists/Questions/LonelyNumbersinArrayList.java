import java.util.*;
public class LonelyNumbersinArrayList {

	public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
		Collections.sort(nums);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=1; i < nums.size()-1; i++) {
			if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)){
				list.add(nums.get(i));
			}
		}
		if (nums.size() == 1) {
			list.add(nums.get(0));
		}
		if (nums.size() > 1) {
			if (nums.get(0) + 1 < nums.get(1)) {
				list.add(nums.get(0));
			}
			if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
				list.add(nums.get(nums.size()-1));
			}
		}
		return list;
	}


	public static void main (String args[]) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(6);
		list.add(5);
		list.add(8);
        
		System.out.println("Lonely Numbers in ArrayList : " + findLonely(list));
	}
}