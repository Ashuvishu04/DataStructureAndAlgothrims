package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
    List<Integer> l;
    int size;
    int min;
    int secondMin;

    public MinStack() {
      l = new LinkedList<>();
      size = 0;
      min = 0;
      secondMin =0;
    }

    public void push(int x) {
      if(size ==0){
        min = x;
      }
      else if(x<min){
        secondMin = min;
        min = x;
      }
      l.add(x);
      size++;
    }

    public void pop() {
        if(size!=0){
          if(l.get(size-1) == min){
            l.remove(size - 1);
            size--;
            if(!l.contains(min)){
              min = secondMin;
            }
          }
          else {
            l.remove(size - 1);
            size--;
          }
        }
    }

    public int top() {
      return l.get(size-1);
    }

    public int getMin() {
      return min;
    }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(395);
    minStack.getMin();
    minStack.top();
    minStack.getMin();
    minStack.push(276);
    minStack.push(29);
    minStack.getMin();
    minStack.push(-482);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.push(-108);
    minStack.push(-251);
    minStack.getMin();
    minStack.push(-439);
    minStack.top();
    minStack.push(-370);
    minStack.pop();
    minStack.pop();
    minStack.getMin();
    minStack.pop();
    minStack.getMin();
    minStack.getMin();
    minStack.pop();
    minStack.getMin();
    minStack.push(-158);
    minStack.push(82);
    minStack.pop();
    minStack.push(-176);

  }
}

class MinStack2 {

  /** initialize your data structure here. */
  Stack<Integer> stack =  new Stack<>();
  Stack<Integer> minStack = new Stack<>();

  public void push(int x) {
    if(minStack.isEmpty() || x<=minStack.peek()){
      minStack.push(x);
    }
    stack.push(x);
  }

  public void pop() {
    if(minStack.peek().equals(stack.peek())){
      minStack.pop();
    }
    stack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }

  public static void main(String[] args) {
    MinStack2 minStack = new MinStack2();
    minStack.push(512);
    minStack.push(-1024);
    minStack.push(-1024);
    minStack.push(512);
    minStack.pop();
    minStack.getMin();
    minStack.pop();
    minStack.getMin();
    minStack.pop();
    minStack.getMin();
  }
}
