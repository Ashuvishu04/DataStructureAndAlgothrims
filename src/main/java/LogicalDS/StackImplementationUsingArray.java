package LogicalDS;

public class StackImplementationUsingArray {

  int top;
  int[] stack;

  public void createStack(int size){
    stack = new int[size];
    top = -1;
  }

  public void push(int element){
    if(isFull()){
      System.out.println("Stack is already full");
    }
    else {
      top++;
      stack[top] = element;
    }
  }

  public void pop(){
    if(isEmpty()){
      System.out.println("Stack is empty not able to remove elements");
    }
    else {
      stack[top] = Integer.MIN_VALUE;
      top--;
    }
  }

  public int peek(){
    return stack[top];
  }

  public boolean isEmpty(){
    if(top==-1){
        return true;
    }
    else{
      return false;
    }
  }

  public boolean isFull(){
    if(top==stack.length){
      return true;
    }
    else{
      return false;
    }
  }

}
