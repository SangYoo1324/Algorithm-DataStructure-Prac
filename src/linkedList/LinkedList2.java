package linkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        Node2 head  = new Node2(1);

        head.append(2);
        head.append(3);
        head.append(4);
//        head.append(5);
        head.retrieve();
    }


}

class Node2{
    int data;
    Node2 next = null;
    Node2(int d){
        // 첫 노드 생성
        this.data = d;
    }

    void append(int d) {
        // d를 이용해 노드 생성
        Node2 end = new Node2(d);
        // startNode 는 언제나 head
        Node2 startNode = this;
        while(startNode.next != null){
            startNode = startNode.next;
        }
        startNode.next = end;
        System.out.println("마지막 Node:"+ startNode.next.data);
    }


    void delete(int target){

        //시작노드
        Node2 startNode = this;

        //해당 노드 찾기까지 진행
        while(startNode.next != null){
            if(startNode.next.data == target){
                // 다음 다음 노드로 연결 이어줌
                startNode.next= startNode.next.next;
            }else{
                startNode = startNode.next;
            }
        }
    }

    void retrieve(){
        Node2 startNode = this;
        // next가 없는 node까지 진행(next가 없는 노드에서 멈추므로 sout 마지막꺼 해줘야함)
        while(startNode.next != null){
            System.out.println(startNode.data+"=>");
            startNode = startNode.next;
        }

        //마지막꺼
        System.out.println(startNode.data);
    }
}


