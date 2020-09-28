package InterviewQuestions;

import java.util.HashSet;

public class IntersectionNodes {

  public static void main(String[] args) {

  }

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    HashSet<Integer> references = new HashSet<>();

    while (headA != null) {
      references.add(headA.hashCode());
      headA = headA.next;
    }

    while (headB!=null){
      if(references.contains(headB.hashCode())){
        return headB;
      }else {
        references.add(headB.hashCode());
        headB = headB.next;
      }
    }
    return null;
  }
}