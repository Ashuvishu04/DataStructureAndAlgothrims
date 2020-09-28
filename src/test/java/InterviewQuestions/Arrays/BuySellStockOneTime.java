package InterviewQuestions.Arrays;

public class BuySellStockOneTime {

  public static void main(String[] args) {
    int[] nums = new int[]{7,1,5,3,6,4};
    maxProfit(nums);
  }

  public static int maxProfit(int[] prices) {
    if(prices.length==0) return 0;
    int maxProfit = 0;
    int min = prices[0];
    for(int i=0;i<prices.length;i++){
      min = Math.min(min,prices[i]);
      maxProfit = Math.max(prices[i] - min,maxProfit);
    }
    return maxProfit;
  }
}
