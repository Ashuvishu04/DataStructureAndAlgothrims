package InterviewQuestions;

import java.util.Stack;

public class RemoveOuterParentheses {

  public static void main(String[] args) {
    String s = "(()(()))";  //() (())
    System.out.println(removeOuterParentheses(s));
  }
  public static String removeOuterParentheses(String s) {
    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    char[] chars = s.toCharArray();

    for(int i=0;i<chars.length;i++){
      if(chars[i]=='('){
        if(!stack.isEmpty()){
          sb.append(chars[i]);
        }
        stack.push(chars[i]);
      }
      else{
        stack.pop();
        if(!stack.isEmpty()) {
          sb.append(chars[i]);
        }
      }
    }
    return sb.toString();
  }
}
