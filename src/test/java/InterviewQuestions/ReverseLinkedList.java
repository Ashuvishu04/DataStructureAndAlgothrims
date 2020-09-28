package InterviewQuestions;

import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {

  public static void main(String[] args) {

    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(3);
    listNode.next.next.next = new ListNode(4);
    listNode.next.next.next.next = new ListNode(5);
    reverseList2(listNode);
  }

  public static ListNode reverseList(ListNode head) {
    Stack<Integer> s = new Stack<Integer>();

    while(head.next !=null){
      s.push(head.val);
      head = head.next;
    }

    ListNode current_node = head;
    while(!s.isEmpty()){
      head.next = new ListNode(s.pop());
      head = head.next;
    }
    return current_node;
  }

  public static ListNode reverseList2(ListNode head) {
   ListNode prev = null;

   while (head!=null){
     ListNode next  = head.next;
     head.next = prev;
     prev = head;
     head = next;
   }
   return prev;
  }


  static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
