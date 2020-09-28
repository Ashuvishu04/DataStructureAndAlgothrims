package InterviewQuestions.Arrays;

public class LeaderInArray {

  public static void main(String[] args) {
    int[] nums =  {15,16,3,2,6,1,4};
    //findLeaders(nums);
    findLeaders2(nums);
  }

  public static void findLeaders(int[] nums){

    for(int i=0;i<nums.length;i++){
      int j;
      for(j=i+1;j<nums.length;j++){
        if(nums[j]>nums[i]){
          break;
        }
      }
      if(j==nums.length){
        System.out.println(nums[i]);
      }
    }
  }

  public static void findLeaders2(int[] nums){
    int n = nums.length;
    int max = nums[n-1];
    System.out.println(max);
    for(int i = n-2;i>=0;i--){
      if(nums[i]>max){
        System.out.println(nums[i]);
        max = nums[i];
      }
    }
  }
}
