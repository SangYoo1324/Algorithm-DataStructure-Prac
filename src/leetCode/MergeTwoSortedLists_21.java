package leetCode;

import java.util.List;

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(3);
        ListNode list3 = new ListNode(5);
        ListNode list4 = new ListNode(2);
        ListNode list5 = new ListNode(4);
        ListNode list6 = new ListNode(6);
        // 1,3,5
        list1.next = list2;
        list2.next = list3;
// 2,4,6
//        list3.next = list4;
        list4.next = list5;
        list5.next = list6;

        Solution21 solution21 = new Solution21();
        ListNode target = solution21.mergeTwoLists(list1,list4);
        ListNode current = target;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }

    }
}

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        ListNode list1Current = list1;
        ListNode list2Current = list2;

        while(list1Current != null && list2Current != null){
            System.out.println("list1Current = "+list1Current.val);
            System.out.println("list2Current = "+list2Current.val);

            if(list1Current.val>list2Current.val){
                System.out.println("list1 is bigger");
                head.next  = list2Current;
                head = head.next;
                list2Current = list2Current.next;
            }
            else{

                head.next= list1Current;
                head = head.next;
                list1Current = list1Current.next;
                System.out.println("same or list2 is bigger");
            }

        }

        if(list1Current !=null) head.next = list1Current;
        if(list2Current !=null) head.next = list2Current;
        return dummy.next;
    }




}

class Solution21_2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }
}