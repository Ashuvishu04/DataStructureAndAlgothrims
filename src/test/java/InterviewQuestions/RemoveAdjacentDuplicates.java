package InterviewQuestions;

public class RemoveAdjacentDuplicates {

  public static void main(String[] args) {
    String s = "aaaaaaaa";
    System.out.println(removeDuplicates(s));
  }

  public static String removeDuplicates(String S) {
   char[] chars = new char[S.length()];
   int i=0;

   for(int j=0;j<S.length();j++){
     char current = S.charAt(j);

     if(i>0 && chars[i-1]==current){
       i--;
     }
     else{
       chars[i] = current;
       i++;
     }
   }
   return new String(chars,0,i);
  }


}
