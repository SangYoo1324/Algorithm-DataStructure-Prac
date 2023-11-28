package leetCode;
//
//*
// * Definition for singly-linked list.
//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }

import java.util.List;

public class RemoveNthNodeFromEnd_19 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
//        ListNode list6 = new ListNode(6);
        list1.next = list2;
//        list2.next = list3;
//        list3.next = list4;
//        list4.next = list5;
//        list5.next = list6;

        Solution19 solution19 = new Solution19();
        ListNode  ln = solution19.removeNthFromEnd(list1,2);
        ListNode current = ln;
        while(current.next !=null){
            System.out.print(current.val+" > ");
            current = current.next;
        }
        System.out.println(current.val);

    }
}

class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null || head.next == null) return  null;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode fast = dummyNode;
        ListNode slow = dummyNode;

        for(int i = 1; i<=n+1; i++){
            System.out.println(i);
            fast = fast.next;
            if (fast != null) {
                System.out.println(fast.val);
            }

        }

        while(fast !=null){
//            System.out.println("slow.val = "+slow.val);
            fast = fast.next;
            slow = slow.next;
        }
//        System.out.println("slow.next = "+slow.next.val);
        slow.next = slow.next.next;





    return dummyNode.next;    }
}