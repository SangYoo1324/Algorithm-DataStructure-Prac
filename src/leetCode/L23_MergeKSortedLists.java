package leetCode;

public class L23_MergeKSortedLists {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(4);
        ListNode list3 = new ListNode(5);
        list1.next = list2;
        list2.next = list3;



        ListNode list4 = new ListNode(1);
        ListNode list5 = new ListNode(3);
        ListNode list6 = new ListNode(4);
        list4.next = list5;
        list5.next = list6;

        ListNode list7 = new ListNode(2);
        ListNode list8 = new ListNode(6);
        list7.next = list8;

        Solution23 solution23 = new Solution23();

        Solution23.looper(  solution23.mergeKLists(new ListNode[]{list1, list4, list7}));

    }
}

class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {

        return mergeSort(lists, 0 , lists.length-1);
    }


    public ListNode mergeSort(ListNode[] lists, int left, int right){
        // base case
        if(left == right) return lists[left];

        // left<right
        if(left<right){
            int mid = (left+right)/2;

            //left side
            ListNode leftSide = mergeSort(lists,left, mid);
            //right side
            ListNode rightSide= mergeSort(lists, mid+1, right);

            //끝까지 내려가면 merge 정렬하면서 다시 올라옴
            // 굳이 리턴 안써도 되는데 마지막에는 정렬된 첫번째 노드를 리턴해야 하므로 필요함
            return merge(leftSide, rightSide);
        }else return null;
    }

    public ListNode merge(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(l1!= null && l2 !=null){
            if(l1.val>l2.val){
                current.next= l2;
                current = current.next;
                l2 = l2.next;
            }else{
                current.next= l1;
                current = current.next;
                l1 = l1.next;
            }
        }

        //이어붙여줌
        if(l1 != null){
            current.next= l1;
        }
        if(l2 != null){
            current.next= l2;
        }





            return dummy.next;

    }

    public static void looper(ListNode root){
        while(root !=null){
            System.out.print(root.val+"->");
            root = root.next;
        }
        System.out.println();
    }
}
