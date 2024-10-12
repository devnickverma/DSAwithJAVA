import java.util.*;
public class question3{
  public static int maxProfit(int[] prices) {
      int buy = prices[0]; 
      int profit = 0; 
      for (int i=1; i<prices.length; i++) { 
         if (buy < prices[i]) { 
            profit = Math.max(prices[i] - buy, profit); 
          } 
         else { 
            buy = prices[i]; 
          } 
      } 
      return profit;
   }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, 1, 5, 3, 6};
        System.out.println("Maximum profit will be : " + maxProfit(arr));
    }
}


