package InterviewQuestions;

import java.util.Arrays;

public class TwoMissingNumber {

  public static void main(String[] args) {
    int a[] = {2,4,6,1,3,5,8,10};
    missingNumbers(a);
  }

  private static void missingNumbers(int[] a) {
    int maxValue = a.length + 2;
    int excepted = (maxValue * (maxValue +1))/2;
    int actual = Arrays.stream(a).sum();

    int diff = excepted - actual;
    int average = diff/2;


    int firstNumber = (average *(average +1))/2 -  Arrays.stream(a).filter(m->m<=average).sum();
    int secondNumber = diff - firstNumber;
    System.out.println(firstNumber + "        " + secondNumber);
  }
}
