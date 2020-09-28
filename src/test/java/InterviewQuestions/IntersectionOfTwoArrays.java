package InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArrays {

  public static void main(String[] args) {
      IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
      int[] nums1 = {4,5,9};
      int[] nums2 = {9,4,9,8,4};
      intersectionOfTwoArrays.intersect(nums1,nums2);
  }

  public int[] intersect(int[] nums1, int[] nums2) {

    List<Integer> integers = new LinkedList<>();
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int num : nums1){
      if(map.containsKey(num)){
        map.put(num,map.get(num) + 1);
      }else{
        map.put(num,1);
      }
    }

    for(int num : nums2){
      if(map.containsKey(num) && map.get(num)>0){
        integers.add(num);
        map.put(num,map.get(num) - 1);
      }
    }
    int[] result = new int[integers.size()];
    int i = 0;
    for(int n : integers){
      result[i++] = n;
    }

    return result;
  }

}
