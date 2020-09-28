package PhysicalDS.LinkedList;

public class CircularSingleLinkedList {

  private Node head;
  private Node tail;
  private int size;

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public Node getTail() {
    return tail;
  }

  public void setTail(Node tail) {
    this.tail = tail;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Node createCircularSingleLinkedList(int nodeValue){
    Node node = new Node();
    node.setValue(nodeValue);
    node.setNext(node);
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  public void insertInLinkedList(int nodeValue, int location){
    Node node = new Node();
    node.setValue(nodeValue);
    if(!existsLinkedList()){
      System.out.println("The linked list does not exist!!");
      return;
    }
    else if(location == 0){
      node.setNext(head);
      head = node;
      tail.setNext(node);
    }
    else if(location >= size){
      node.setNext(head);
      tail.setNext(node);
      tail = node;
     /* tail.setNext(node);
      tail = node;
      tail.setNext(head);*/
    }
    else{
      Node tempNode = head;
      int index = 0;
      while(index < location - 1){
        tempNode = tempNode.getNext();
        index++;
      }
      //tempNode currently references to node after which we should insert new node
      Node nextNode = tempNode.getNext(); //this is the immediate next node after new node
      tempNode.setNext(node);//update reference of tempNode to reference to new node
      node.setNext(nextNode);//update newly added nodes' next.
    }
    setSize(getSize()+1);
  }

  public boolean existsLinkedList() {
    // if head is not null return true otherwise return false
    return head != null;
  }

  public void traverseLinkedList() {
    if (existsLinkedList()) {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {

        System.out.print(tempNode.getValue());
        if (i != size - 1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.getNext();
      }
      System.out.println("\n");
    }else {
      System.out.println("\nLinked List does not exists !");
    }
  }


  boolean searchNode(int nodeValue) {
    if (existsLinkedList()) {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        // System.out.print(tempNode.value);
        if (tempNode.getValue() == nodeValue) {
          System.out.print("Found the node at location: "+i);
          return true;
        }
        tempNode = tempNode.getNext();
      }
    }
    System.out.print("Node not found!! ");
    return false;
  }

  public void deletionOfNode(int location) {
    if (!existsLinkedList()) {
      System.out.println("The linked list does not exist!!");// Linked List does not exists
      return;
    } else if (location == 0) { // we want to delete first element
      head = head.getNext();
      tail.setNext(head);
      setSize(getSize()-1);
      if(getSize() == 0) { // if there are no more nodes in this list
        tail = null;
      }
    }else if (location >= getSize()){ //If location is not in range or equal, then delete last node
      Node tempNode = head;
      for (int i = 0; i < size - 1; i++) {
        tempNode = tempNode.getNext(); //temp node points to 2nd last node
      }
      if (tempNode == head) { //if this is the only element in the list
        tail = head = null;
        setSize(getSize()-1);
        return;
      }
      tempNode.setNext(head);
      tail= tempNode;
      setSize(getSize()-1);

    }else { //if any inside node is to be deleted
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++) {
        tempNode = tempNode.getNext(); // we need to traverse till we find the location
      }
      tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
      setSize(getSize()-1);
    }//end of else
  }//end of method

}
