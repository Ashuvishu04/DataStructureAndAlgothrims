package InterviewQuestions;

import java.util.List;

public class ThreeSum {

  public static void main(String[] args) {
      int[] nums = {-1, 0, 1, 2, -1, -4};
      List<List<Integer>> sums = threeSum(nums);
      System.out.println(sums);
  }

  public static List<List<Integer>> threeSum(int[] nums){
    int i=0,sum =0,j=0;

    while(i!=nums.length){
      if(i!=j){
        sum = sum + nums[j];
        j++;
      }
      i++;
    }
    return null;
  }

}
