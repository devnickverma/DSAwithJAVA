import java.util.*;
public class MonotonicArrayList {

	public static boolean isMonotonic(ArrayList<Integer> A) {
		boolean inc = true;
		boolean dec = true;
		for (int i=0; i<A.size()-1; i++) {
			if (A.get(i) > A.get(i+1))
				inc = false;
			if (A.get(i) < A.get(i+1))
				dec = false;
		}
		return inc || dec;
	}


	public static void main (String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		System.out.println(list);
        System.out.println("Monotonic : " + isMonotonic(list));

	}
}