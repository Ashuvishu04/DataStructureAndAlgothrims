package InterviewQuestions;

public class PalindromeNumber {

  public static void main(String[] args) {
    int x = 121;
    PalindromeNumber palindromeNumber =  new PalindromeNumber();
    palindromeNumber.isPalindrome(x);
  }

  public boolean isPalindrome(int x) {
    StringBuilder s = new StringBuilder(String.valueOf(x));

    return s.reverse().toString().equals(String.valueOf(x));
  }

  }
