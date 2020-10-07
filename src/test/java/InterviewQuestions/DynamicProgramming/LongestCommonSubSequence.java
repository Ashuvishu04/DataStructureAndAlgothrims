package InterviewQuestions.DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubSequence {

  public static void main(String[] args) {
    String str1 = "abcvdefgh";
    String str2 = "bqdrcvefgh";

    LCS(str1,str2);
  }

  static String LCS(String str1, String str2) {
    int m = str1.length();
    int n = str2.length();
    int[][] a = new int[m+1][n+1];

    for(int i=1;i<m+1;i++)
    {
      for(int j=1;j<n+1;j++)
      {
        if(str1.charAt(i-1) == str2.charAt(j-1))
        {
          a[i][j] = a[i-1][j-1] + 1;
        }
        else
        {
          a[i][j] = Math.max(a[i-1][j],a[i][j-1]);
        }
      }
    }

    System.out.println(a[m][n]);
    // Get Longest substring now

    int i = m;
    int j = n;
    int k = a[m][n] -1;
    char[] ch = new char[a[m][n]];

    while(i > 0 && j > 0) {
      if(str1.charAt(i-1) == str2.charAt(j-1))
      {
        ch[k] = str1.charAt(i-1);
        i--;
        j--;
        k--;
      }
      else
      {
        if(a[i-1][j] > a[i][j-1])
        {
          i = i-1;
        }
        else
        {
          j = j-1;
        }
      }
    }

    return Arrays.toString(ch);

  }
}
