package InterviewQuestions;

public class SearchInsertPosition {

  public static void main(String[] args) {
    int[] nums = {1};
    int target = 2;
    System.out.println(searchInsert(nums,target));
  }

  public static int searchInsert(int[] nums, int target) {

    int i = 0;

    if(nums.length == 1 && nums[0]<target){
      return i+1;
    }
    if(nums.length == 1 && nums[0]>target){
      return i;
    }

    while(nums[i] < target){
      i++;
      if(i == nums.length-1){
        break;
      }
    }

    if(nums[i]==target || target<nums[i]){
      return i;
    }
    return i+1;

  }




}
