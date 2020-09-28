package InterviewQuestions.Arrays;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

  public static void main(String[] args) {
    int[] arr = {5,3,2,10,6,8,1,4,12,7,4};
    nextGreater(arr);
  }

  public static HashMap<Integer,Integer> nextGreater(int[] arr){
    Stack<Integer> stack = new Stack();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num : arr){
      if(stack.isEmpty()){
        stack.push(num);
      }else {
        if (num < stack.peek()) {
          stack.push(num);
        } else {
          while (!stack.isEmpty()) {
            if(num>stack.peek()) {
              int val = stack.pop();
              map.put(val, num);
            }else{
              break;
            }
          }
          stack.push(num);
        }
      }
    }
    while(!stack.isEmpty()){
      map.put(stack.pop(),0);
    }
    return map;
  }
}
