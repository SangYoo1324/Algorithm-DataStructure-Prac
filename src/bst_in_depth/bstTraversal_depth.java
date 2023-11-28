package bst_in_depth;

public class bstTraversal_depth {
    public static void main(String[] args) {
        //PreOrder   root left right
        //InOrder    left root right
        //PostOrder  left right root

        Tree tree = new Tree();
        Node node7 = tree.makeNode(null,null,7);
        Node node6 = tree.makeNode(null,null,6);
        Node node5 = tree.makeNode(null,null,5);
        Node node4 = tree.makeNode(null,null,4);
        Node node3  = tree.makeNode(node6,node7,3);
        Node node2  = tree.makeNode(node4,node5, 2);
        Node node  = tree.makeNode(node2,node3, 1);

        tree.inOrder(node);


    }
}


class Tree{
    Node root;

    public Node makeNode(Node left, Node right, int data){
        Node node  = new Node(data);
        node.right = right;
        node.left = left;
        return node;
    }

    public void inOrder(Node rootNode){
        if(rootNode !=null){
            //왼쪽 먼저
            inOrder(rootNode.left);
            //root출력
            System.out.println(rootNode.data);
            //그다음 오른쪽 탐색
            inOrder(rootNode.right);
        }
    }

    public void preOrder(Node rootNode){
        if(rootNode != null){
            //일단 rootNode 출력
            System.out.println(rootNode.data);
            preOrder(rootNode.left);
            preOrder(rootNode.right);
        }
    }

    public void postOrder(Node rootNode){
        if(rootNode !=null){
            postOrder(rootNode.left);
            postOrder(rootNode.right);
            System.out.println(rootNode.data);

        }
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int i) {
        this.data = i;
    }
}