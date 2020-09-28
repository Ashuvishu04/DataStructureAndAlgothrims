package InterviewQuestions.Arrays;

public class SegregateZerosAndOnes {

  public static void main(String[] args) {

    int[] nums = {0,0,1,0,1,1,0,1};
    segregate(nums);
  }

  public static int[] segregate(int[] nums){
      int count = 0;
      for(int num : nums){
        if(num ==0) count++;
      }

      for(int i=0;i<count;i++){
        nums[i] = 0;
      }

     for(int i=count;i<nums.length;i++){
       nums[i] = 1;
     }

     return nums;
  }
}
