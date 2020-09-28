package InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FourSum {

  public static void main(String[] args) {
    int nums[] = {1, 0, -1, 0, -2, 2};
    fourSum(nums,0);
  }

  public static List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> output = new LinkedList<>();
    HashMap<List<Integer>,Integer> map = new HashMap<>();
    List<Integer> l;
    for(int i =0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        l = new LinkedList<>();
        l.add(nums[i]);
        l.add(nums[j]);
        map.put(l,map.getOrDefault(l,0)+1);
      }
    }


    List<List<Integer>> s  = map.keySet().stream().collect(Collectors.toList());
    for(int i=0;i<s.size();i++){
      for(int j=i+1;j<s.size();j++){
        List<Integer> ele = new LinkedList<>();
        ele.addAll(s.get(i));
        ele.addAll(s.get(j));
        if(ele.stream().mapToInt(Integer::intValue).sum() ==target){
          if(!output.contains(ele.stream().sorted().collect(Collectors.toList()))){
            output.add(ele.stream().sorted().collect(Collectors.toList()));
          }
        }
      }
    }

   return output;

  }

}
