package InterviewQuestions;

import java.util.Arrays;

public class ContainerWithMostWater {

  public static void main(String[] args) {
      int[] nums = {1,8,6,2,5,4,8,3,7};
      maxArea(nums);
  }

  public static int maxArea(int[] height) {
    int i =0;
    int j = height.length-1;
    int maxArea = 0;


    while (i<j){
      int element = Math.min(height[i],height[j]);
      if(element * (j-i) > maxArea){
        maxArea = element * (j-i);
      }

      if(element == height[i]){
        i++;
      }else{
        j--;
      }
    }
    return maxArea;
  }
}
