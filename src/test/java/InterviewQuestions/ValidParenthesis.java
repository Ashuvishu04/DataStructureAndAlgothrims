package InterviewQuestions;

import java.util.Stack;

public class ValidParenthesis {

  public static void main(String[] args) {
    String s = "()";
    System.out.println(isValidParenthesis(s));
  }

  public static boolean isValidParenthesis(String s){
    Stack stack = new Stack();

    if(s.length()%2!=0){
      return false;
    }

    char[] c = s.toCharArray();
    for(int i=0;i<c.length;i++) {
      if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
        stack.push(c[i]);
      }
      else if(!stack.empty()) {
       if (stack.peek().toString().equals("(") && c[i] == ')') {
          stack.pop();
        } else if (stack.peek().toString().equals("{") && c[i] == '}') {
          stack.pop();
        } else if (stack.peek().toString().equals("[") && c[i] == ']') {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    if(stack.size()==0){
      return true;
    }
    else{
      return false;
    }
  }

}
