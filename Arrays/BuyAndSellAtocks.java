import java.util.*;
public class BuyAndSellAtocks{
    public static int BuyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
               profit = prices[i] - buyPrice; // Today,s profit 
               maxProfit = Math.max(maxProfit, profit);
            }
            else {
               buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int prices[] = {7, 1, 5, 3, 6, 8};
      System.out.println("Maximum profit will be : " + BuyAndSell(prices));
  }
} 