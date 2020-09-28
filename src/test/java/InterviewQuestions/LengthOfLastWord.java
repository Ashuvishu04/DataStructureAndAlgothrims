package InterviewQuestions;

public class LengthOfLastWord {

  public static void main(String[] args) {
    lengthOfLastWord("");
  }

  public static int lengthOfLastWord(String s) {
    s = s.trim();
    
    String[] sh = s.split(" ");

    return sh[sh.length-1].length();
  }
}
