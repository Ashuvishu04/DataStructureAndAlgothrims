package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate2 {

  public static void main(String[] args) {
    int[] nums = {1,2,3,1,2,3};
    System.out.println(containsNearbyDuplicate(nums,2));
  }

  public static boolean containsNearbyDuplicate(int[] nums,int k) {

    for(int i=0;i<nums.length-k;i++){
        for(int j = i+1;j<=i+k;j++) {
          if(j>=nums.length){
            break;
          }
          if (nums[i] == nums[j]) {
            return true;
          }
        }
    }
    return false;
  }
}
