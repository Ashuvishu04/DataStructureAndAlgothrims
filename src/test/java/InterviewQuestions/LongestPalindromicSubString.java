package InterviewQuestions;

public class LongestPalindromicSubString {

  public static void main(String[] args) {
    String s = "babad";
    longestPalindrome(s);
  }

  public static String longestPalindrome(String s) {
    String s1;
    int start = 0;
    int end = s.length() - 1;

    while(start<end){
        int mid  = start + end/2;
        if(s.substring(start,mid).equals(s.substring(mid,end))){
          s1 = s.substring(start,end);
        }else{
          longestPalindrome(s.substring(start,mid));
        }
    }
    return  null;
  }

}
