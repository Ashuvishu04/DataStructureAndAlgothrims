package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class LongestSubString {

  public static void main(String[] args) {
    String s = "c";
    System.out.println(longestSubStringWithoutRepeating(s));
  }

  public static int longestSubStringWithoutRepeating(String s){
    String longestSubString = "";
    char[] ch = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    int i = 0;
    if(s.equals(" ") || s.length()==1){
      return 1;
    }

      for(int j=i;j<ch.length;j++){
          if(sb.toString().contains(String.valueOf(ch[j]))){
            if(longestSubString.length()<sb.toString().length()){
              longestSubString = sb.toString();
            }
            i = i+1;
            j = i-1;
            sb = new StringBuilder();
            continue;
          }
          else {
            sb.append(ch[j]);
          }
        if(longestSubString.length()<sb.toString().length()){
          longestSubString = sb.toString();
        }
      }
    return longestSubString.length();
  }

  public static int longestSubStringWithoutRepeating2(String s){
    String longestSubString = "";
    List<String> allSub = new LinkedList<>();
    char[] ch = s.toCharArray();
    for(int i=0;i<ch.length;i++){
      StringBuilder sb = new StringBuilder();
      for(int j=i;j<ch.length;j++){
        if(sb.toString().contains(String.valueOf(ch[j]))){
          allSub.add(sb.toString());
          break;
        }
        else {
          sb.append(ch[j]);
        }
      }
      allSub.add(sb.toString());
    }

    for(String sub :allSub){
      if(longestSubString.length()<sub.length()){
        longestSubString = sub;
      }
    }
    return longestSubString.length();
  }

}
