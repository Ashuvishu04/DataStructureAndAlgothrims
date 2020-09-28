package InterviewQuestions.Arrays;

import InterviewQuestions.XORQueries;

public class NumberOccuringOddTimes {

  public static void main(String[] args) {
    int[] a = {1,5,5,1,2,3,4,2,1,2,1,2,3,2,4};
    System.out.println(oddElement(a));
  }

  public static int oddElement(int[] a){
    int j=0;
    for(int i=0;i<a.length;i++){
       j = j ^ a[i];
    }
    return j;
  }
/*  XOR

   0 a a
   a 0 a
   0 0 0
   a a 0*/
}
