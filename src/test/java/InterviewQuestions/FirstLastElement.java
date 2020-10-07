package InterviewQuestions;

public class FirstLastElement {

  public static void main(String[] args) {
    FirstLastElement element = new FirstLastElement();
    int[] nums = {5,7,7,8,8,10};
    element.searchRange(nums,6);
  }

  /*private int extremeInsertionIndex(int[] nums, int target, boolean left) {
    int lo = 0;
    int hi = nums.length;

    while (lo < hi) {
      int mid = (lo + hi) / 2;
      if (nums[mid] > target || (left && target == nums[mid])) {
        hi = mid;
      }
      else {
        lo = mid+1;
      }
    }

    return lo;
  }

  public int[] searchRange(int[] nums, int target) {
    int[] targetRange = {-1, -1};

    int leftIdx = extremeInsertionIndex(nums, target, true);

    if (leftIdx == nums.length || nums[leftIdx] != target) {
      return targetRange;
    }

    targetRange[0] = leftIdx;
    targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

    return targetRange;
  }
*/

  public int[] searchRange(int[] nums, int target) {
    int[] ans = new int[2];

    int i = findNumber(nums,0,nums.length,target);
    int j = findNumber(nums,i+1,nums.length,target);
    ans[0] = i;
    ans[1] = j;

    if(ans[0]==nums.length || ans[0]!=target){
      return new int[]{-1,-1};
    }

    return ans;
  }

  public int findNumber(int[] nums,int start, int end, int target){
    int mid = (start + end)/2;

    if(start<=end) {
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        mid = findNumber(nums, start, mid - 1, target);
      } else if (nums[mid] < target) {
        mid = findNumber(nums, mid + 1, end, target);
      }
    }else{
      mid = -1;
    }

    return mid;
  }
}
