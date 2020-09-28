package InterviewQuestions;

import java.util.HashSet;

public class LinkedListCycle {

  public static void main(String[] args) {
    ListNode listNode = new ListNode(3);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(0);
    listNode.next.next.next = new ListNode(-4);
    listNode.next.next.next.next = listNode.next;
    hasCycle2(listNode);
  }

  public static boolean hasCycle(ListNode head) {
    HashSet<Integer> s = new HashSet<>();

    while(head!=null){
      if(s.contains(head.hashCode())){
        return true;
      }
      s.add(head.hashCode());
      head = head.next;
    }
    return false;
  }

  public static boolean hasCycle2(ListNode head) {

    if (head == null || head.next == null) {
      return false;
    }

    ListNode slow = head;
    ListNode fast = head.next;

    while(slow!=fast){
      if(fast == null || fast.next == null){
        return false;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
