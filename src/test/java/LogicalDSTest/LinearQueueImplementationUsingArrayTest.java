package LogicalDSTest;

import LogicalDS.LinearQueueImplementationUsingArray;

public class LinearQueueImplementationUsingArrayTest {

  public static void main(String[] args){
    LinearQueueImplementationUsingArray l = new LinearQueueImplementationUsingArray(5);
    l.peek();
    System.out.println(l.isEmpty());
    System.out.println(l.isFull());
    System.out.println("-------");
    l.enqueue(5);
    l.peek();
    System.out.println(l.isEmpty());
    System.out.println(l.isFull());
    System.out.println("-------");
    l.enqueue(10);
    l.dequeue();
    l.peek();
    System.out.println(l.isEmpty());
    System.out.println(l.isFull());
    System.out.println("-------");
    l.enqueue(34);
    l.peek();
    System.out.println(l.isEmpty());
    System.out.println(l.isFull());
    System.out.println("-------");
    l.enqueue(36);
    l.peek();
    System.out.println(l.isEmpty());
    System.out.println(l.isFull());
    System.out.println("-------");
    l.enqueue(370);
    l.dequeue();
    l.peek();
    l.deleteQueue();
    System.out.println(l.isEmpty());
    System.out.println(l.isFull());
    System.out.println("-------");
    l.enqueue(3);
    l.dequeue();
    l.peek();
    System.out.println(l.isEmpty());
    System.out.println(l.isFull());
    System.out.println("-------");
  }

}
