package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Pattern132 {

  public static void main(String[] args) {
    int[] nums = {};
    boolean is132Pattern = find132pattern2(nums);
    System.out.println(is132Pattern);
  }
  public static boolean find132pattern(int[] nums) {
    List<List> l = new LinkedList<>();
    List l1;
    int ai,aj,ak;
    for(int i=0;i<nums.length;i++){
      ai = nums[i];
      for(int j=i+1;j<nums.length;j++){
        aj = nums[j];
        for(int k=j+1;k<nums.length;k++){
          ak = nums[k];
          if(ai<ak && ak<aj){
            l1 = new LinkedList();
            l1.add(ai);
            l1.add(aj);
            l1.add(ak);
            l.add(l1);
          }
        }
      }
    }
    System.out.println(l);
    return l.size()>=1;
  }

  public static boolean find132pattern2(int[] nums) {
   // [3,1,4,2]
   // [3,1,1,1]

    if(nums==null || nums.length<3){
      return false;
    }

    int[] min = new int[nums.length];
    min[0] = nums[0];
    for(int i=1;i<nums.length;i++){
      min[i] = Math.min(nums[i],min[i-1]);
    }

    Stack<Integer> s = new Stack<>();
    for(int i = nums.length-1;i>=0;i--){
      if(nums[i] >min[i]){
        while(!s.isEmpty() && s.peek()<=min[i]){
          s.pop();
        }
        while(!s.isEmpty() && s.peek()<nums[i]){
          return true;
        }
        s.push(nums[i]);
      }
    }
    return false;
  }
}
