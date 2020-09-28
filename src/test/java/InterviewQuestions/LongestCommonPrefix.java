package InterviewQuestions;

public class LongestCommonPrefix {

  public static void main(String[] args) {
   String[] s =  new String[]{"ca","a"};
   System.out.println(longestCommonPrefix(s));
  }

  public static String longestCommonPrefix(String[] strs) {
    String longest = "";
    String s = "";
    for(int i =0 ;i<strs.length;i++){
      if(s.equals("") || s.length() > strs[i].length()){
        s = strs[i];
      }
    }
    for(int i =s.length();i>0;i--) {
      for (int j = 0; j < strs.length; j++) {
        if (strs[j].startsWith(s.substring(0, i))) {
          longest = strs[j].substring(0, i);
        } else {
          longest = "";
          break;
        }
      }
      if(!longest.equals("")){
          return longest;
      }
    }

    return longest;
  }

}
