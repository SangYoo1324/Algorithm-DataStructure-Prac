package leetCode;

public class SwapNodesInPairs_24 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        list1.next = list2;
        list2.next = list3;
//
//
//
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
//        ListNode list6 = new ListNode(6);
        list3.next = list4;
//        list4.next = list5;
//        list5.next = list6;
//
//        ListNode list7 = new ListNode(7);
//        ListNode list8 = new ListNode(8);
//        list6.next =list7;
//        list7.next = list8;
        Solution24 solution24 = new Solution24();
//        Solution23.looper(solution24.swapPairs(list1));
        solution24.swapPairs(list1);
    }
}

class Solution24 {
    public ListNode swapPairs(ListNode head) {

        ListNode temp = new ListNode(0);
        temp.next = head;
        // 0- >1 상태
        ListNode current = temp;
        swap(temp);



        Solution23.looper(temp);
        return temp.next;
    }

    public void swap(ListNode node){
        if(node == null) return;


        ListNode firstNode= node.next;
        ListNode secodneNode= null;

        // firstNode 가 있다면 secondNode 포인터 생성
        if(firstNode !=null){
            secodneNode = firstNode.next;
        }

        // secondNode까지 있다면 이제 스왑 프로세스 진행
        // first,secondNode중 한개라도 없으면 sawp프로세스가 진행이 안됨
        if(secodneNode != null){
            ListNode secondNext = secodneNode.next;
            secodneNode.next = firstNode;
            node.next= secodneNode;
            firstNode.next= secondNext;
            swap(firstNode);
        }
    }
}