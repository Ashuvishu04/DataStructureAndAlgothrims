package InterviewQuestions;

public class ReverseInteger {

  public static void main(String[] args) {
    int num = 1534236469;
    reverse(num);
  }

  public static int reverse(int x) {

    int reverse = 0;

    if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE){
      return 0;
    }

    while(x!=0){
      int rem = x%10;
      reverse = (reverse * 10) + rem;
      x = x/10;
    }

    return reverse;
  }
}
