package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {

  int[] arr;

  public Solution(int[] nums) {
    arr = nums;
  }

  /** Resets the array to its original configuration and return it. */
  public int[] reset() {
    return arr;
  }

  /** Returns a random shuffling of the array. */
  public int[] shuffle() {
    Set<Integer> a = new HashSet<>();
    Random random = new Random();
    while(a.size()!=arr.length){
      int num = random.nextInt(arr.length);
      int val = arr[num];
      a.add(val);
    }

    return a.stream().mapToInt(Integer::intValue).toArray();
  }

  public int[] sortedSquares(int[] A) {
    List<Integer> l = new LinkedList<>();
    for(int i=0;i<A.length;i++){
      l.add(Math.abs(A[i]));
    }
    return l.stream().sorted().mapToInt(Integer::intValue).toArray();
  }

  public boolean checkInclusion(String s1, String s2) {
    boolean isPresent = false;
    List<String> l = new LinkedList<>();
    char[] ch = s1.toCharArray();

    StringBuilder sb;
    for(int i=0;i<ch.length;i++){
      sb =new StringBuilder();
      sb.append(ch[i]);
      for(int j=i+1;j<ch.length;i++){
        sb.append(ch[j]);
      }
      l.add(sb.toString());
    }

    for(int i=0;i<l.size();i++){
      if(s2.contains(l.get(i))){
         isPresent=true;
      }
    }
    return isPresent;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3};
    Solution solution =  new Solution(nums);
    solution.reset();
    solution.shuffle();
  }

}
