package InterviewQuestions.DynamicProgramming;

public class LongestPalindromicSubSequence {

  public static void main(String[] args) {
    String s = "abcecqba";
    String lps = LPS(s);
    System.out.println(lps);
    System.out.println(lps.length());
  }

  public static String LPS(String s){
    int[][] dp = new int[s.length()][s.length()];

    for (int i = s.length() - 1; i >= 0; i--) {
      dp[i][i] = 1;
      for (int j = i+1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          dp[i][j] = dp[i+1][j-1] + 2;
        } else {
          dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
        }
      }
    }
    int palindromicLength = dp[0][s.length()-1];

    char[] chars = new char[palindromicLength];
    int i = 0,j = s.length() -1;
    int start =0,end = palindromicLength - 1;

    while (start < end){
      if(s.charAt(i) == s.charAt(j))
      {
        chars[start] = s.charAt(i);
        chars[end] = s.charAt(i);
        start = start + 1;
        end = end - 1;
        i = i+1;
        j = j-1;
      }
      else{
        if(dp[i+1][j] > dp[i][j-1])
        {
          i = i+1;
        }
        else
        {
          j = j-1;
        }
      }
    }

    if(end == start)
      chars[end] = s.charAt(i);
    return String.valueOf(chars);
  }
}
