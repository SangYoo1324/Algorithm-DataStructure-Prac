package codility.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node head;
    int size;

    public BinaryTree(){
        head = null;
        size= 0;
    }

    public void push(Node input){
        if(size == 0){
           Node node = input;//넣고자 하는 대상
           head = node;
        }else{
        Node node = head;// 맨 위 head값 불러옴(전역변수인 head를 터치하지 않기 위함)
            Queue<Node> searchOrder = new LinkedList<>();
            searchOrder.add(node);

            while(!searchOrder.isEmpty()){
                Node temp = searchOrder.poll();
                if(temp.left ==null){// 왼쪽 노드 비었는지
                    temp.left = input;//비었으면 넣고 끝내
                    break;
                }else{
                    searchOrder.add(temp.left);//한칸 밑으로 내려옴
                }

                if(temp.right == null){//오른쪽 노드 비어있는지
                    temp.right = input;//비었으면 넣고 끝내
                    break;
                }else{//안비었으면 queue로 이동해서 순서기달려(왼쪽이 먼저 들가있어서 왼쪽부터)
                    searchOrder.add(temp.right);
                }
            }


        }
        size++;
        }

        public int pop(Node node){
        if(contain(node)){

        }
        return 1;
        }

        public boolean contain(Node compareNode){
        boolean check = false;
        if(size!=0){ // 트리에 뭐 하나라도 있다면
            Queue<Node> searchOrder = new LinkedList<Node>();
            searchOrder.add(head);//가장 맨 위 일단 선택

            while(!searchOrder.isEmpty()){
                Node temp = searchOrder.poll(); //헤드값 꺼내와
                if(isSame(temp,compareNode)){
                    check = true;
                    break;//헤드가 비교노드랑 같으면 끝내
                }
                if(temp.left != null){//왼쪽탐색
                    searchOrder.add(temp.left);
                }
                if(temp.right !=null){
                    searchOrder.add(temp.right);
                }
            }
        }
        return check;
        }

        public boolean isSame(Node a, Node b){
        if(a.value==b.value &&a.left==b.left && a.right==b.right){
            return true;
        }else return false;
        }

        public Node removeLastNode(){
        Node last = head;
        if(size == 1){
            head = null;
        }else{
            Queue<Node> searchOrder = new LinkedList<Node>();
            searchOrder.add(last);//탐색 큐 시작

            while(!searchOrder.isEmpty()){
                Node whereNodeAt= searchOrder.poll();
                last = whereNodeAt;
                if (whereNodeAt.left != null) {//왼쪽에 값이 있다면
                searchOrder.add(whereNodeAt.left);//왼쪽 밑 탐색 예약
                }
                if(whereNodeAt.right != null){
                    searchOrder.add(whereNodeAt.right);
                }
                }//while 종료시점에서 last = 맨마지막 추가된 노드

            }
            Node temp = last;
            last=null;
        return temp;
        }


        }


