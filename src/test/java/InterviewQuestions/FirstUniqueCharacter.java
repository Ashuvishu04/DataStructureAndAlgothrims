package InterviewQuestions;


import java.util.Arrays;

public class FirstUniqueCharacter {

  public static void main(String[] args) {
    String s = "loveleetcode";
    firstUniqChar(s);
  }

  public static int firstUniqChar(String s) {
    for(int i =0;i<s.length();i++){
      char ch = s.charAt(i);
      if(!s.substring(0,i).contains(String.valueOf(ch)) && !s.substring(i+1,s.length()).contains(String.valueOf(ch))){
          return i;
      }
    }
    return -1;
  }
}
