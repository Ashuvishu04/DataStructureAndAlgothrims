package PhysicalDS.LinkedList;

public class SingleLinkedList {

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

  public Node createSingleLinkedList(int nodeValue){
    head = new Node();
    tail = new Node();
    Node node = new Node();
    node.setValue(nodeValue);
    node.setNext(null);
    head = node;
    tail = node;
    size =1;
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
    }
    else if(location >= size){
      node.setNext(null);
      tail.setNext(node);
      tail = node;
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
      Node node = head;
      for (int i=0;i<getSize();i++) {
        System.out.print(node.getValue());
        if(i!=getSize()-1){
          System.out.print("->");
        }
        node = node.getNext();
      }
      System.out.print("\n");
    }
    else{
      System.out.println("Linked List does not exist");
    }
  }

  public boolean searchNode(int nodeValue) {
    if (existsLinkedList()) {
      Node tempNode = head;
      for (int i = 0; i < getSize(); i++) {
        if (tempNode.getValue() == nodeValue) {
          System.out.print("Found the node at location: "+i+"\n");
          return true;
        }
        tempNode = tempNode.getNext();
      }
    }
    System.out.print("Node not found!! \n");
    return false;
  }

  public void deleteNodeInLinkedList(int location){
    if(!existsLinkedList()){
      System.out.println("The linked list does not exist!!");
      return;
    }
    else if(location == 0){
      head = head.getNext();
      setSize(getSize()-1);
      if(getSize() == 0){
        tail =null;
      }
    }
    else if(location >=getSize()){
      Node tempNode = head;
      for(int i=0;i<size-1;i++){
        tempNode = tempNode.getNext();
      }
      if(tempNode == head){
        head =null;
        tail =null;
        setSize(getSize()-1);
        return;
      }
        tempNode.setNext(null);
        tail = tempNode;
        setSize(getSize()-1);
    }
    else {
      Node tempNode = head;
      for (int i=0;i<location-1;i++){
        tempNode = tempNode.getNext();
      }
      tempNode.setNext(tempNode.getNext().getNext());
      setSize(getSize()-1);
    }
    }

  //Deletes entire Linked List
  public void deleteLinkedList() {
    System.out.println("\n\nDeleting Linked List...");
    head = null;
    tail = null;
    System.out.println("Linked List deleted successfully !");
  }

}
