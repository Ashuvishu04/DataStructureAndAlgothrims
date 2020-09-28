package InterviewQuestions;

import java.util.Arrays;

public class SortArrayByParity {

  public static void main(String[] args) {
    int[] A = {1,3,2,4};
    sortArrayByParity2(A);
  }

  public static int[] sortArrayByParity(int[] A) {
    int i =0;
    for(int j=0;j<A.length;j++){
      if(A[j]%2==0){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        i++;
      }
    }
    return A;
  }

  public static int[] sortArrayByParity2(int[] A) {
    return Arrays.stream(A).boxed().sorted((a, b) -> Integer.compare(a%2, b%2)).mapToInt(i -> i).toArray();
  }
}
