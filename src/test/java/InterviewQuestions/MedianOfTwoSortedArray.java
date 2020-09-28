package InterviewQuestions;

public class MedianOfTwoSortedArray {

  public static void main(String[] args) {
    MedianOfTwoSortedArray median = new MedianOfTwoSortedArray();
    int[] nums1 = {1,3};
    int[] nums2 = {2,4};
    median.findMedianSortedArrays(nums1,nums2);
  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    double ans;
    int i = 0;
    for(int num : nums1){
      i += num;
    }

    for(int num : nums2){
      i += num;
    }

    ans = Double.valueOf(i)/(nums1.length + nums2.length);

    return ans;
  }
}
