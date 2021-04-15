package com.company;
import java.util.*;

public class IntersectionTwoLinkedList extends ListNode {

    IntersectionTwoLinkedList(int x) {
        super(x);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        HashSet<ListNode> intersection = new HashSet<ListNode>();

        while (headB != null) {
            intersection.add(headB);
            headB = headB.next;
        }
        while (headA != null) {
            if (intersection.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }
}
