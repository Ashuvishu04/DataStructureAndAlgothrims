package InterviewQuestions;

public class AllStringPermutation {

  public static void main(String[] args) {
    String s = "geek";
    printPermutn(s, "");
    printDistinctPermutn(s, "");
  }

  static void printPermutn(String str, String ans)
  {
    if (str.length() == 0) {
      System.out.print(ans + " ");
      return;
    }

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);
      String ros = str.substring(0, i) +
          str.substring(i + 1);
      printPermutn(ros, ans + ch);
    }
  }

  static void printDistinctPermutn(String str, String ans) {
    if (str.length() == 0) {
      System.out.print(ans + " ");
      return;
    }

    boolean alpha[] = new boolean[26];

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);

      String ros = str.substring(0, i) +
          str.substring(i + 1);

      if (alpha[ch - 'a'] == false)
        printDistinctPermutn(ros, ans + ch);
      alpha[ch - 'a'] = true;
    }
  }
}
