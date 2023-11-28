package codility.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {

    Node head;
    int size;

    // 초기화
    public BinaryTree2(){
        head = null;
        size = 0;
    }

    public void push(Node input){
        if(size ==0){
            Node node = input;
            head = node;
        }else{
            Node node = head; // 원래 head값 불러옴
            Queue<Node> searchOrder  = new LinkedList<>();
            searchOrder.add(node);

            while(!searchOrder.isEmpty()){
                Node temp = searchOrder.poll();
                if(temp.left == null){  // 왼쪽 비어있으면
                    temp.left = input; // 넣음
                    break;
                }else{
                    searchOrder.add(temp.left);  //왼쪽 한칸 밑으로 내려옴
                }if(temp.right == null){// 오른쪽 비어있으면
                    temp.right = input; // 넣음
                    break;
                }else{
                    searchOrder.add(temp.right);// 오른쪽 한칸 밑으로 내려옴
                }
            }
        }
        size++;
    }

}
