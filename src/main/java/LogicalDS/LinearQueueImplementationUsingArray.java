package LogicalDS;

public class LinearQueueImplementationUsingArray {
  int[] queue;
  int topOfQueue,beginningOfQueue;

  public LinearQueueImplementationUsingArray(int size){
    queue = new int[size];
    topOfQueue = -1;
    beginningOfQueue = -1;
  }

  public void enqueue(int element){
    if(isFull()){
       System.out.println("Queue is already full");
    }
    else if(beginningOfQueue ==-1){
      beginningOfQueue =0;
      topOfQueue++;
      queue[topOfQueue] = element;
    }
    else{
      topOfQueue++;
      queue[topOfQueue] = element;
    }
  }

  public void dequeue(){
  if(isEmpty()){
    System.out.println("Queue is Empty");
  }
  else{
    if(beginningOfQueue >topOfQueue){
      beginningOfQueue = topOfQueue =-1;
      System.out.println("Last Element has already been dequeue");
    }
    else {
      System.out.println(queue[beginningOfQueue]);
      beginningOfQueue++;
    }
  }
  }

  public void peek(){
    if(isEmpty()){
      System.out.println("Queue is Empty");
    }
    else{
       System.out.println(queue[beginningOfQueue]);
    }
  }

  public boolean isFull(){
    if(queue == null){
      System.out.println("No Queue Exit");
      return false;
    }else {
      return queue.length - 1 == topOfQueue;
    }
  }

  public boolean isEmpty(){
    if(queue == null){
      System.out.println("No Queue Exit");
      return true;
    }
    else{
    return beginningOfQueue == -1;}
  }

  public void deleteQueue(){
    queue = null;
  }
}
