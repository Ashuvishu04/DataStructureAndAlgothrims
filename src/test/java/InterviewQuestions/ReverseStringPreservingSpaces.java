package InterviewQuestions;

public class ReverseStringPreservingSpaces {

  public static void main(String[] args) {
    String s = "abc de";
    System.out.println(reverse(s));
  }

  public static String reverse(String s){
    char[] ch = s.toCharArray();
    char[] ch1 = new char[ch.length];

    for(int i=0;i<ch.length;i++){
      if(ch[i]==' '){
           ch1[i] = ' ';
      }
    }

    int j =0;
    for(int i = ch.length-1 ;i>=0;i--){
      if(ch[i]!=' '){
        if(ch1[j] == ' '){
          j++;
        }
        ch1[j] = ch[i];
        j++;
      }
    }

    return String.valueOf(ch1);
  }
}
