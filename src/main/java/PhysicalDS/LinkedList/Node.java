package PhysicalDS.LinkedList;

public class Node {

  private int value;
  private Node next;

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString(){
    return value + "";
  }

}
