package LogicalDSTest;

import LogicalDS.CircularQueueImplementationUsingArray;

public class CircularQueueImplementationUsingArrayTest {

  public static void main(String[] args){
    CircularQueueImplementationUsingArray c = new CircularQueueImplementationUsingArray(5);

    c.enqueue(5);
    c.enqueue(6);
    c.enqueue(8);
    c.peek();
    c.isEmpty();
    c.isFull();
    c.enqueue(9);
    c.dequeue();
    c.enqueue(60);
    c.enqueue(67);
    c.peek();
  }

}
