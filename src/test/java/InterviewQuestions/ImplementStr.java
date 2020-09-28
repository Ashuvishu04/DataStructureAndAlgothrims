package InterviewQuestions;

public class ImplementStr {

  public static void main(String[] args) {
    ImplementStr implementStr = new ImplementStr();
    implementStr.strStr("mississippi","issip");
  }

  public int strStr(String haystack, String needle) {
    int index = 0;
    if(needle.equals("")){
      return 0;
    }

    if(!haystack.contains(needle)){
      return -1;
    }

    int l = needle.length();

    for(int i=0;i<haystack.length();i++){
      if(haystack.substring(i,i+l).equals(needle)){
        index  = i;
        break;
      }
    }
    return index;
  }
}
