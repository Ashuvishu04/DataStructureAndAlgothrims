package InterviewQuestions;

public class PlusOne {

  public static void main(String[] args) {
      int[] a = {1,7,9};
      a = plusOne(a);
      System.out.println(a);
  }

  public static int[] plusOne(int[] digits) {
    int index = digits.length-1;
    for(int i =index;i>=0;i--){
      if(digits[i]<9){
        digits[i]++;
        return digits;
      }
      else{
        digits[i] = 0;
      }
    }

    int[] newNumber = new int[digits.length+1];
    newNumber[0] = 1;

    return newNumber;
  }

}
