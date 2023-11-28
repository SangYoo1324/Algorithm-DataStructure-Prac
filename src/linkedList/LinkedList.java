package linkedList;

public class LinkedList {

    public static void main(String[] args) {
        Node head  = new Node(1);

        head.append(2);
        head.append(3);
        head.append(4);
//        head.append(5);
        head.retrieve();
    }
}

class Node {
    int data;
    Node next = null;

    Node(int d){
        this.data = d;
    }

    void append(int d){
        //d 로 마지막 될 node 생성
        Node end  = new Node(d);
        Node startNode = this;
        // 마지막 노드 찾아가기
        while(startNode.next!= null){
            startNode= startNode.next;
        }
        startNode.next = end;
        System.out.println("마지막 node: "+startNode.next.data);
    }

    void delete(int d){
        //시작노드(현재노드)
        Node startNode = this;
        while(startNode.next != null){
            if(startNode.next.data ==d) {
                //다음 다음 노드로 연결 이어줌
                startNode.next = startNode.next.next;
            }else {
                startNode = startNode.next;
            }
        }
    }

    void retrieve(){
        Node startNode = this;
        while(startNode.next != null){
            System.out.println(startNode.data+"=>");
            startNode= startNode.next;
        }
        //마지막꺼
        System.out.println(startNode.data);
    }
}
