package LogicalDS;

public class CircularQueueImplementationUsingArray {
  int[] queue;
  int topOfQueue,beginningOfQueue;

  public CircularQueueImplementationUsingArray(int size){
    queue = new int[size];
    topOfQueue = -1;
    beginningOfQueue = -1;
  }

  public void enqueue(int element){
    if(queue == null){
      System.out.println("No Queue exit");
    }
    else if(isFull()){
      System.out.println("Queue is Full");
    }
    else{
      initializeStartOfArray();
      if(topOfQueue+1==queue.length){
        topOfQueue=0;
      }
      else{
        topOfQueue++;
      }
      queue[topOfQueue] = element;
    }
  }

  public void initializeStartOfArray() {
    if (beginningOfQueue == -1) {
      beginningOfQueue = 0;
    }
  }

  public void dequeue(){
  if(queue == null){
    System.out.println("No queue exit");
  }
  else if(isEmpty()){
    System.out.println("Queue is Empty");
  }
  else{
    System.out.println(queue[beginningOfQueue]);
    if(beginningOfQueue==topOfQueue){
      beginningOfQueue=topOfQueue=-1;
    }
    else if(beginningOfQueue+1==queue.length){
      beginningOfQueue = 0;
    }
    else {
      beginningOfQueue++;
    }
  }
  }

  public void peek(){
    if(queue == null){
      System.out.println("No queue exit");
    }
    else if(isEmpty()){
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
      if(topOfQueue + 1 == beginningOfQueue){
        return true;
      }
      else if(beginningOfQueue ==0 && topOfQueue +1 == queue.length){
        return true;
      }
      else{
        return false;
      }
    }
  }

  public boolean isEmpty(){
    if(queue == null){
      System.out.println("No Queue Exit");
      return true;
    }
    else if(topOfQueue == -1){
      return true;
    }
    else{
      return false;
    }
  }

  public void deleteQueue(){
    queue = null;
  }

  public void printArray() {
    System.out.println("Array now...");
    for(int i=0; i<queue.length; i++) {
      System.out.print(queue[i]+"  ");
    }
    System.out.println("\nStart = " + beginningOfQueue);
    System.out.println("End = "+ topOfQueue);
  }
}
