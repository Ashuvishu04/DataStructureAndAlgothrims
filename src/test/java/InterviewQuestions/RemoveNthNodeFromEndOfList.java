package InterviewQuestions;

public class RemoveNthNodeFromEndOfList {

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    removeNthFromEnd(listNode,1);
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    int j = -n;

    if(head.next == null){
      head = null;
      return head;
    }

    ListNode current = head;
    ListNode delNode = head;
    while(current!=null){
      current = current.next;
      if(j>0){
        delNode = delNode.next;
      }
      j++;
    }

    if(j==0){
      return delNode.next;
    }

    delNode.next = delNode.next.next;
    return head;
  }

   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
