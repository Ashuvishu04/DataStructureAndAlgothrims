package InterviewQuestions.Arrays;

import java.util.Arrays;

public class PairOfSums {

  public static void main(String[] args) {
    int[] arr = {5,8,3,4,2,6,10,7,1,9};
    Arrays.sort(arr);
    findPairs(arr,11);
  }

  public static void findPairs(int[] arr,int sum){
    int l = 0;
    int r = arr.length - 1;

    while(l<r){
      if(arr[l] + arr[r] < sum){
        l++;
      }else if(arr[l] + arr[r] > sum){
        r--;
      }else{
        System.out.println(arr[l] + " " + arr[r]);
        l++;r--;
      }
    }
  }
}
