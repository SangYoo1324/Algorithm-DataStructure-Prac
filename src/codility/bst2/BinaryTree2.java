package codility.bst2;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
    Node head;
    int size;

    public BinaryTree2(){
        head = null;
        size = 0;

    }

    public void push(Node input) {
        //when first push
        if(size==0){
            head = input;
        }else {
            Queue<Node> searchOrder = new LinkedList<>();
            searchOrder.add(head);

            while(!searchOrder.isEmpty()){
                Node temp = searchOrder.poll();
                if(temp.left==null){
                    temp.left=input;
                    break;
                }
                else{
                    searchOrder.add(temp.left);
                }


                if(temp.right==null){
                    temp.right= input;
                    break;
                }

                else{
                    searchOrder.add(temp.right);
                }
            }


        }
        size++;



    }

}
