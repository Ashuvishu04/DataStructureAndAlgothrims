package InterviewQuestions;

public class ReverseBits {

  public static void main(String[] args) {
//    int n = 00000010100101000001111010011100;
//    reverseBits(n);
  }

  public static int reverseBits(int n) {
    int reverse = 0;
    for (int i = 0; i < 32; i++) {
      reverse = (reverse << 1) | (n & 1);
      n >>= 1;
    }
    return reverse;
  }
}
