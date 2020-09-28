package InterviewQuestions;

public class FirstLastElement {

  public static void main(String[] args) {
    FirstLastElement element = new FirstLastElement();
    int[] nums = {5,7,7,8,8,10};
    element.searchRange(nums,8);
  }

  private int extremeInsertionIndex(int[] nums, int target, boolean left) {
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

}
