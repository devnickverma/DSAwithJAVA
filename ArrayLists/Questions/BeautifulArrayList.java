import java.util.*;
public class BeautifulArrayList {

	public static ArrayList<Integer> beautifulArray(int n) {
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(1);
		for(int i=2; i<=n; i++) {
			ArrayList<Integer>temp=new ArrayList<>();
			for(Integer e:ans) {
				if(2*e<=n)temp.add(e*2);
			}
			for(Integer e:ans) {
				if(2*e-1<=n)temp.add(e*2-1);
			}
			ans=temp;
		}
		return ans;
	}


	public static void main (String args[]) {

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Most Frequent Number following Key : " + beautifulArray(4));
	}
}