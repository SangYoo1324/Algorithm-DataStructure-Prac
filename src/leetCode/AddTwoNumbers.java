package leetCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        Solution2 solution  = new Solution2();


        ListNode returnedListNode = solution.addTwoNumbers(l1,l2);

        System.out.println(returnedListNode.val);
    }



}

//     * Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultDummy = new ListNode(0);
        ListNode current = resultDummy;

        int remaining = 0;
        while(l1 !=null && l2 != null){
            System.out.println("remaining: "+remaining);
            int sum = l1.val+ l2.val+remaining;
            System.out.println(sum);
            //remaining 사용 했으니 초기화 시켜줌
            if(remaining==1){
                remaining--;
            }
            if(sum>=10){
                remaining++;
                sum = sum%10;
            }
            l2= l2.next;
            l1= l1.next;
            current.next = new ListNode(sum);
            current = current.next;
        }
        // 이미 끝까지 왔다면 아얘 실행 안될거임
        while(l1!=null){
            int sum = l1.val+remaining;
            //remaining 사용 했으니 초기화 시켜줌
            if(remaining==1){
                remaining--;
            }
            if(sum>=10){
                remaining++;
                sum = sum%10;
            }
            l1= l1.next;
            current.next = new ListNode(sum);
            current = current.next;

        }
        while(l2!=null){
            int sum = l2.val+remaining;
            //remaining 사용 했으니 초기화 시켜줌
            if(remaining==1){
                remaining--;
            }
            if(sum>=10){
                remaining++;
                sum = sum%10;
            }
            l2= l2.next;
            current.next = new ListNode(sum);
            current = current.next;

        }

        // 마지막 자리수 계산 후 1단계 올려지면 1 추가해줌
        if(remaining==1){
            current.next = new ListNode(1);
        }





        return resultDummy.next;
    }
}
