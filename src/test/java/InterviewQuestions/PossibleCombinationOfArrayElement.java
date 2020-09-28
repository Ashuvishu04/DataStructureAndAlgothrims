package InterviewQuestions;

import java.util.Arrays;

public class PossibleCombinationOfArrayElement {

  public static void Binary(int[] arr,int n) {
    if (n < 1) {
      System.out.println(Arrays.toString(arr));
    } else {
      arr[n - 1] = 0;
      Binary(arr,n - 1);
      arr[n - 1] = 1;
      Binary(arr,n - 1);
    }
  }


  public static void kString(int[] A,int n,int k) {
    if (n < 1) {
      System.out.println(Arrays.toString(A));
    } else {
      for(int j=0;j<k;j++){
          A[n-1] = j;
          kString(A,n-1,k);
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[2];
    //Binary(arr, arr.length);

    kString(arr,arr.length,3);
  }


}
