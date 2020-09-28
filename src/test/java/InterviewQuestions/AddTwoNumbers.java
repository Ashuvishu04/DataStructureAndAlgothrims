package InterviewQuestions;

public class AddTwoNumbers {

  public static void main(String[] args) {
    ListNode l1  = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2  = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    addTwoNumbers(l1,l2);
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l = new ListNode();
    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder();

    do{
      sb.append(l1.val);
      l1 = l1.next;
    }
    while(l1.next!=null);
    sb.append(l1.val);

    do{
      sb1.append(l2.val);
      l2 = l2.next;
    }
    while(l2.next!=null);
    sb1.append(l2.val);

    int sum = Integer.valueOf(sb.reverse().toString()) + Integer.valueOf(sb1.reverse().toString());
    while(sum!=0){
      int rem = sum%10;
      sum = sum/10;
      l.next = new ListNode(rem);
      l = l.next;
    }
    return l;

/*    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return dummyHead.next;*/
  }

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
