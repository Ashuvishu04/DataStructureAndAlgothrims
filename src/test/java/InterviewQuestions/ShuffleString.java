package InterviewQuestions;

public class ShuffleString {

  public static void main(String[] args) {
    String s = "codeleet";
    int[] a = {0,1,2};
    System.out.println(restoreString(s,a));
  }

  public static String restoreString(String s, int[] indices) {
    StringBuilder sb = new StringBuilder();

    for(int i =0;i<s.length();i++){
      sb.append(s.charAt(indices[i]));
      
    }
    return sb.toString();
  }

}
