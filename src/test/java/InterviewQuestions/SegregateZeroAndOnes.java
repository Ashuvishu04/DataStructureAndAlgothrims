package InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SegregateZeroAndOnes {

  public static void main(String[] args) {
    int[] a = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    a = segregate(a);
    for(int i =0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }

  public static int[] segregate(int[] a){

    int left =0,right = a.length-1;

    while(left<right){

      while(a[left]==0 && left<right)
        left++;

      while(a[right]==1 && left<right)
        right--;

      if(left<right){
        a[left] = 0;
        a[right] =1;
        left++;
        right--;
      }
    }
    return a;
  }

}
