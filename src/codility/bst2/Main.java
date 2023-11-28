package codility.bst2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2= new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        BinaryTree2 binaryTree2 = new BinaryTree2();

        binaryTree2.push(node1);
        binaryTree2.push(node2);
        binaryTree2.push(node3);
        binaryTree2.push(node4);
        binaryTree2.push(node5);
        binaryTree2.push(node6);
        binaryTree2.push(node7);

      printBFS(node1);

    }

    public static void printBFS(Node root){

        Queue<Node> queue= new LinkedList<Node>();

        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.value);

            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right !=null){
                queue.add(temp.right);
            }
        }
    }

    public static void printDFS_inOrder(Node root){
        Stack<Node> stack = new Stack();
            stack.push(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
         if(temp.left!= null){
             stack.push(temp.left);
         }
         if(temp.right!= null){
             stack.push(temp.right);
         }
        }

        Iterator it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
/*
             1
          2     3
        4   5  6  7

left -> root -> right
4251637


 */
    }

    public static void printDFS_preOrder(Node root){

        /*
             1
          2     3
        4   5  6  7

root -> left->right
1245367


 */
    }

    public static void printDFS_postOrder(Node root){

        /*
             1
          2     3
        4   5  6  7

left-> right->root
2526731


 */
    }
}
