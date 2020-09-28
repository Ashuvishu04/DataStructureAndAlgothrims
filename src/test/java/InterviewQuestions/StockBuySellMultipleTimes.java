package InterviewQuestions;

import java.util.PriorityQueue;

public class StockBuySellMultipleTimes {

  public static void main(String[] args) {
    int[] arr = {2,4,1};
    maxProfit(arr);
  }

  public static int maxProfit(int[] prices) {
    int profit = 0;
    int minProfit = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i=0;i<prices.length;i++){
      if(prices[i]<minProfit){
        minProfit = prices[i];
      }
      else if(prices[i]>maxProfit){
        maxProfit = prices[i];
      }
      else if(prices[i]<prices[i-1]){
        profit = profit + (maxProfit-minProfit);
        minProfit = prices[i];
        maxProfit = prices[i];
      }
    }

    if(minProfit>maxProfit){
      return 0;
    }
    if(maxProfit-minProfit>0){
      profit += maxProfit-minProfit;
    }

    return profit;
  }
}
