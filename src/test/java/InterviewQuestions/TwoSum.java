package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    int[] arr = null;

    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++) {
        if (nums[i] + nums[j] == target) {
          arr = new int[2];
          arr[0] = i;
          arr[1] = j;
          break;
        }
      }
      if(arr!=null){
        break;
      }
    }

    return arr;
  }

  public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  public static void main(String[] args) {
    System.out.println(twoSum(new int[]{2,5,5,11},10));
  }

}
