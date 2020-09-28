package LogicalDSTest;

import LogicalDS.StackImplementationUsingArray;

public class StackImplementationUsingArrayTest {

  public static void main(String[] args) {
    StackImplementationUsingArray s = new StackImplementationUsingArray();
    s.createStack(10);
    System.out.println(s.isEmpty());
    System.out.println(s.isFull());
    s.push(2);
    s.push(4);
    s.push(6);
    s.push(8);
    s.pop();
    System.out.println(s.peek());
  }
}
