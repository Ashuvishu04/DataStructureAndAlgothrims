package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {

  public static void main(String[] args) {
    int[] nums1 = {4,1,2};
    int[] nums2 = {1,3,8,7,6,5,10};
    nextGreaterElement2(nums1,nums2);
  }

  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] result = new int[nums1.length];
    Arrays.fill(result,-1);
    for(int i=0;i<nums1.length;i++){
      for(int j=0;j<nums2.length;j++){
        if(nums2[j]==nums1[i]){
            for(int k=j+1;k<nums2.length;k++){
              if(nums2[k]>nums2[j]){
                result[i] = nums2[k];
                break;
              }
            }
          break;
        }
      }
    }
    return result;
  }

  public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();

    for(Integer num : nums2){
      while(!stack.isEmpty() && stack.peek()<num){
        map.put(stack.pop(),num);
      }
      stack.push(num);
    }

    for(int i=0;i<nums1.length;i++){
      nums1[i] = map.getOrDefault(nums1[i],-1);
    }
    return nums1;
  }
}
