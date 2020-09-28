package InterviewQuestions;

public class isValidPalindrome {

  public static void main(String[] args) {
    String s = ".,";
    isPalindrome(s);
  }

  public static boolean isPalindrome(String s) {
    char[] ch = s.toCharArray();

    int i = 0;
    int j = ch.length-1;

    while(i<j){
      while(!Character.isDigit(ch[i]) && !Character.isAlphabetic(ch[i])){
        if(i==j){return false;}
        i++;
      }while(!Character.isDigit(ch[j]) && !Character.isAlphabetic(ch[j])){
        if(i==j){return false;}
        j--;
      }

      if(Character.toLowerCase(ch[i]) != Character.toLowerCase(ch[j])) {
        return false;
      }
      i++;
      j--;
    }
    return true;
    }

}
