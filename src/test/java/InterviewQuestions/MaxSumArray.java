package InterviewQuestions;

public class MaxSumArray {

  public static void main(String[] args) {
     int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
     String s ="";
     maxSubArray(nums);
  }

  public static int maxSubArray(int[] nums) {
    int max_sum = nums[0];
    int sum = max_sum ;
    for(int i =1;i<nums.length;i++){
      sum  = Math.max(nums[i] + sum ,nums[i]);
      max_sum = Math.max(sum,max_sum);
    }
    return max_sum;
  }

}
