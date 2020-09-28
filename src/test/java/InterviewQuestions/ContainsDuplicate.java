package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

  public static void main(String[] args) {
    int[] nums = {1,2,3,1};
    System.out.println(containsDuplicate2(nums));
  }

  public static boolean containsDuplicate(int[] nums) {
    int l = Arrays.stream(nums).distinct().toArray().length;
    if(l == nums.length){
      return false;
    }
    return true;
  }

  public static boolean containsDuplicate2(int[] nums) {
    Set<Integer> s =  new HashSet<>();
    for(int i=0;i<nums.length;i++){
     if(!s.add(nums[i])){
       return true;
     }
   }
    return false;
  }
}
